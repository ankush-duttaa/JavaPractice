import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main2{
	
	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the Size: ");
	String size = br.readLine();
	
	Queue q = new Queue(Integer.parseInt(size));
	q.Insert('A');
	q.Insert('B');
	q.Insert('C');
	q.Insert('D');
	q.Insert('E');
	q.Insert('F');
	q.Insert('G');
	
	q.Remove();
	q.Remove();
	q.Remove();
	q.Remove();
	q.Remove();
	q.Remove();
	q.Remove();
	q.Remove();

	}
}