import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Brakets{
	
	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the full string: ");
	String value = br.readLine();
	char arr[]= value.toCharArray();
	
	int size =  arr.length;
	System.out.println("Enter the full string: " +size);
	
	Stack14 s = new Stack14(size);
	    char c1=arr[0];
	        if(c1=='[' || c1=='{' || c1=='('){ 
		    s.push(c1);
			}else if (c1==']' || c1=='}' || c1==')')
             int x = char c1;
		     int j = s.pop();
			      if( (x=='[' && j== ']' ) || (x=='{' && j== '}' ) (x=='(' && j== ')' )){
              System.out.println("wow");
				  }else {
				System.out.println("uff");  
				  
			}		 
	
	
	
	/* a=1;
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
	    }*/
	}
	
		
		