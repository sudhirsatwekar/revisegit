package queue;

public class queue {

	int f = -1, r = -1;
	int size = 10;
	int arr[] = new int[size];

	void enque(int number) {
		if (r > size - 1) {
			System.out.println("queue overflow");
		}
		else if (f == -1 && r == -1) {
			f = 0;
			r = 0;
			arr[r] = number;
		} 
		else {
			r = r + 1;
			arr[r] = number;
		}
	}

	
	void deque() {
		f=f+1;
	}
	
	
	void display() {
		for (int j = f ; j <= r; j++) {
			System.out.println(arr[j]);
		}

	}
}
