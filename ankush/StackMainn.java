import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StackMainn{
	
	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter size of the Stack: ");
	String size = br.readLine();
	
	Stack14 s = new Stack14(Integer.parseInt(size));
	int a=1;
	int p; 
	while(a ==1 ){  
        System.out.println("Enter 1 for push, 2 for pop, other for exit");
		System.out.println("Enter your choice: ");
	    String value10 = br.readLine();
	    p = Integer.parseInt(value10);
	    if(p==1){
             System.out.println("Enter value for push: ");
	         String value11 = br.readLine();
	         int x = Integer.parseInt(value11);
      	     s.push(x);
	    }  else if(p==2){
             int y = s.pop();
	         System.out.println("popped value:" + y);
	    } else{
		     break ;
	    }
		
	
	
	
	/*System.out.println("Enter First value: ");
	String value = br.readLine();
	s.push(Integer.parseInt(value));
	
	System.out.println("Enter Second value: ");
	String value1 = br.readLine();
	s.push(Integer.parseInt(value1));
	
	System.out.println("Enter Third value: ");
	String value2 = br.readLine();
	s.push(Integer.parseInt(value2));

	System.out.println("Enter Fourth value: ");
	String value3 = br.readLine();
	s.push(Integer.parseInt(value3));
	
	System.out.println("Enter Fifth value: ");
	String value4 = br.readLine();
	s.push(Integer.parseInt(value4));
	
    System.out.println("Enter Sixth value: ");
	String value5 = br.readLine();
	s.push(Integer.parseInt(value5));
	
	System.out.println("Pop 1: " + s.pop());
	System.out.println("Pop 2: " + s.pop());
	System.out.println("Pop 3: " + s.pop());
	System.out.println("Pop 4: " + s.pop());
	System.out.println("Pop 5: " + s.pop());
	System.out.println("Pop 5: " + s.pop());
	*/
	}
  }
}