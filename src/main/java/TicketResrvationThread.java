
public class TicketResrvationThread extends Thread{
	static int seats=10;
	
	public void run() {
		System.out.println(Thread.currentThread());
	}
	public void bookTickets(int n) {
		if(seats>n) {
		seats=seats-n;
		System.out.println("Booked seat "+ n+" Available seats "+seats);
		}
		else {
			System.out.println("Not enough seats Available");
		}
	}
	public static void main(String[] args) throws Exception {
		TicketResrvationThread t1=new TicketResrvationThread();
		t1.start();
		t1.bookTickets(2);
		t1.join();
		TicketResrvationThread t2=new TicketResrvationThread();
		t2.start();
		t2.bookTickets(4);
		t2.join();
		TicketResrvationThread t3=new TicketResrvationThread();
		t3.start();
		t3.bookTickets(4);
		t3.join();
		TicketResrvationThread t4=new TicketResrvationThread();
		t4.start();
		t4.bookTickets(2);
		t4.join();
		

	}

}
