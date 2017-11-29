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
	
	
	
	
	
=[0[998888887777778UI889I990P000]]][---[=]==============\=-]0[-P----------------------------------------------------------------------------------------------------------------
	/*System.out.println("Enter the full string: " +size);*/
	
	 Stack14 s =  new Stack14(size);
	    char c1=arr[0];
		char c2=arr[1];
		char c3=arr[2];
		
		
	     if(c1=='[' || c1=='{' || c1=='('  || c2=='[' || c2=='{' || c2=='(' ||
		    c3=='[' || c3=='{' || c3=='('   ){ 
		 
		    s.push(c1);
			s.push(c2);
			s.push(c3);
			
			
			}
		      else if (c1==']' || c1=='}' || c1=='('  && c2==']' || c2=='}' || c2==')' &&
		                   c3==']' || c3=='}' || c3==')'){
                 char x =c1;
				 
		         char y = s.pop();
			           /*if ((x== '[' && y== ']')||(x== '{' && y== '}')||(x== '(' && y== ')')){
                       System.out.println("Match");
					   }
				  else {
				System.out.println("Not Match");  
				  
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
	}
}

	
	



	
		
		