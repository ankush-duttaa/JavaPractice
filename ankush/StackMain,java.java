import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StackMain{
	
	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter size of the Stack: ");
	String size = br.readLine();
	
	Stack s = new Stack(Integer.parseInt(size));
	
	System.out.println("Enter First value: ");
	String value = br.readLine();
	s.push(Integer.parseInt(value));
	
	System.out.println("Enter Second value: ");
	String value = br.readLine();
	s.push(Integer.parseInt(value));
	
	System.out.println("Enter Third value: ");
	String value = br.readLine();
	s.push(Integer.parseInt(value));

	System.out.println("Enter Fourth value: ");
	String value = br.readLine();
	s.push(Integer.parseInt(value));
	
	System.out.println("Enter Fifth value: ");
	String value = br.readLine();
	s.push(Integer.parseInt(value));
	
    System.out.println("Enter Sixth value: ");
	String value = br.readLine();
	s.push(Integer.parseInt(value));
	
	System.out.println("Pop 1: " + s.pop());//top =3
	System.out.println("Pop 2: " + s.pop());
	System.out.println("Pop 3: " + s.pop());
	System.out.println("Pop 4: " + s.pop());
	System.out.println("Pop 5: " + s.pop());
	System.out.println("Pop 5: " + s.pop());//
	
	}
}