package queue;

public class queueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		queue q=new queue();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.display();
		System.out.println("=================");
		q.deque();
		q.display();
		
		
	}

}
