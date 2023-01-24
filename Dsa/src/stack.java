
public class stack {

	int top=-1;
	int size=6;
	
//	Scanner sc new Scanner()
	int arr[]=new int[size];
	
	void push(int number) {
		
		if(top==size-1) {
			System.out.println("Stack overflow");
		}
		else
			top=top+1;
		arr[top]=number;
		System.out.println(number+"added");
		//System.out.println("array is"+arr);
	}
	
	
     void pop() {
		
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else
			
			top=top-1;
		System.out.println(top+" index removed");
		//System.out.println("array is"+arr);
	}
     
     void peek() {
 		System.out.println(arr[top]);
 		System.out.println("array is"+arr);
 
 	}
     
     void display() {
    	 for(int j=top;j>=0;j--) {
    		 System.out.println(arr[j]);
    	 }
     }
     
    
}
     
	
	
	
	
	
