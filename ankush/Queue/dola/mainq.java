import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Character;
import java.lang.String;

public class mainq{
	
	public static void main(String [] args) throws IOException{
		
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter size of the Stack: ");
	String size = br.readLine();
	
   queue q = new queue(Integer.parseInt(size));
	int a=1;
	int p; 
	while(a ==1 ){  
        System.out.println("Enter 1 for Insert, 2 for Remove, other for exit");
		System.out.println("Enter your choice: ");
	    String value10 = br.readLine();
	    p = Integer.parseInt(value10);
	    if(p==1){
             System.out.println("Enter value for Insert: ");
	         String value11 = br.readLine();
	       char x =value11.ChartAt(value11);		 
			 		 q.Insert(x);
	    }  else if(p==2){
             char y = q.Remove();
	         System.out.println("Remove value is:" + y);
	    } else{
		     break ;
	    }
	}
	}
}
		