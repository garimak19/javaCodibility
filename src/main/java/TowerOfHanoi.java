
public class TowerOfHanoi {
	
	    private static TowerOfHanoi[] tower; 
	    private int stackSize;
	    private int[] stackArray;
	    private int top;
	 
	    
	    public TowerOfHanoi(int size) {
	        this.stackSize = size;
	        this.stackArray = new int[stackSize];
	        this.top = -1;
	    }
	 
	   
	    public void push(int entry) throws Exception {
	    	this.stackArray[++top] = entry;
	    }
	 
	    
	    public int pop() throws Exception {
	        if(this.isStackEmpty()){
	        	System.out.println("Stack underflow.");
	        }
	        return this.stackArray[top--];
	    }
	 
	    /**
	     * Returns top of the stack without removing it.
	     * @return
	     */
	    public int peek() {
	        return stackArray[top];
	    }
	 
	    
	    public boolean isStackEmpty() {
	        return (top == -1);
	    }
	 
	    
	    public boolean isStackFull() {
	        return (top == stackSize - 1);
	    }
	 
	    public void towersOfHanoi(int n) throws Exception {    	 
	       
	        tower = new TowerOfHanoi[4];
	        for (int i = 0; i <= 3; i++){
	            tower[i] = new TowerOfHanoi(4);
	        }
	        for (int d = n; d > 0; d--){
	          
	            tower[1].push(new Integer(d)); 
	        }
	        //Move n disks from tower 1 to 2 using 3 as intermediate tower
	        showTowerStates(n, 1, 2, 3);
	    }
	 
	    public void showTowerStates(int n, int x, int y, int z) {         
	        if (n > 0) {
	            try{
	                showTowerStates(n - 1, x, z, y);
	                //Move d from top of tower x to top of tower 
	                Integer d = (Integer) tower[x].pop(); 
	                tower[y].push(d); 
	                System.out.println("Move disk " + d 
	                        + " from tower "+ x + " to top of tower " + y);
	                showTowerStates(n - 1, z, y, x);
	            } catch(Exception e){
	            	e.printStackTrace();
	            }
	        }
	    }
	 
		public static void main(String args[]){
			try {
				TowerOfHanoi test = new TowerOfHanoi(10);
				test.towersOfHanoi(3);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
