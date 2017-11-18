public class Stack12 {
	int top=-1;
	int [] arr= new int[5];
	
	public int pop(){
	 int x = arr[top];
		top = top -1;
		return x;	
	}
	
	
	public void push(int a){
	
	System.out.println("Pushing: " + a);
		top = top + 1;
		arr[top] = a;
		
		}
}