
public class ThreadSequence extends Thread{
public void run() {
	System.out.println(Thread.currentThread());
}
	public static void main(String[] args) throws Exception {
		ThreadSequence t1=new ThreadSequence();
		
		t1.start();
		t1.join();
		ThreadSequence t2=new ThreadSequence();
		
		t2.start();
		t2.join();
		ThreadSequence t3=new ThreadSequence();
		
		t3.start();
		t3.join();
	}

}
