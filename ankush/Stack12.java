public class Stack12 {
	int top=-1;
	char [] arr= new char[3];
	
	public char pop(){
	 char x = arr[top];
		top = top -1;
		return x;	
	}
	
	
	public void push(char a){
	
	System.out.println("Pushing: " + a);
		top = top + 1;
		arr[top] = a;
		
		}
}