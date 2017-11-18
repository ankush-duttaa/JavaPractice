
public class StackMain{
	
	public static void main(String [] args){
		
	Stack12 s = new Stack12();
	
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	
	System.out.println("Pop 1: " + s.pop());
	System.out.println("Pop 2: " + s.pop());
	System.out.println("Pop 3: " + s.pop());
	System.out.println("Pop 4: " + s.pop());
	System.out.println("Pop 5: " + s.pop());
	System.out.println("Pop 5: " + s.pop());//
	
	}
}