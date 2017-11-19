public class Stack14 {
	int top;
	int [] arr; 
	//int a;
	
	public Stack14(int size) {
		System.out.println("Stack size: " + size);
		arr = new int [size]; 
		top = -1;
		//a=1;
	}
	
	public int pop() {
		
		/*while(int a ==1 ){  
        System.out.println("Enter 1 for push");
		System.out.println("Enter 2 for pop")		
   ;  
    } */ 
		
		
		
		if(top == -1) {
			System.out.println("Stack is empty");
			return 9999999;
		}
		int x = arr[top];
		top = top -1;
		return x;	
	}
	
	public void push(int a) {
		if(top == (arr.length-1)) {
			System.out.println("Stack is full");
			return;
		}
		System.out.println("Pushing: " + a);
		top = top + 1;
		arr[top] = a;		
	}	
}