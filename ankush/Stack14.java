public class Stack14 {
	int top;
	char [] arr; 
	
	
	public Stack14(int size) {
		System.out.println("Stack size: " + size);
		arr = new char [size]; 
		top = -1;
		
	}
	
	public char pop() {
		
		
		if(top == -1) {
			System.out.println("Stack is empty");
			return '@';
		}
		char x = arr[0];
		char y = arr[1];
		char z = arr[2];
		
		top = top -1;
		return x;
		
	}
	
	public void push(char a) {
		if(top == (arr.length-1)) {
			System.out.println("Stack is full");
			return;
		}
		System.out.println("Pushing: " + a);
		top = top + 1;
		arr[top] = a;		
	}	
}