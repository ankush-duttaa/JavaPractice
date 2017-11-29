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
	/*System.out.println("Enter the full string: " +size);*/
	
	 Stack14 s =  new Stack14(size);
	 
	 for(int i=0; i< size; i++) {
		char c1=arr[i];
		
	     if(c1=='[' || c1=='{' || c1=='('){ 
            System.out.println("1. c[" + i + "]" + c1);		 
		    s.push(c1);
		 } else if (c1==']' || c1=='}' || c1==')'  ){
			     System.out.println("2. c[" + i + "]" + c1);
                 char x =c1;				 
		         char y = s.pop();
				 isMatch(x, y);
	     } 
     }		 
	    
		 
		 /*char c2=arr[1];
		
	     if(c2=='[' || c2=='{' || c2=='('){ 
            System.out.println("3. c2=" + c2);		 
		    s.push(c2);
		 } else if (c2==']' || c2=='}' || c2==')'  ){
			 System.out.println("4. c2=" + c2);
                 char x =c2;				 
		         char y = s.pop();
				 isMatch(x, y);
	     }*/
		 
	}
	
	public static boolean isMatch(char x, char y) {
		boolean match;
	    System.out.println("x=" + x + ", y=" + y);
	     if ((y== '[' && x== ']')||
	       (y== '{' && x== '}')||
	       (y== '(' && x== ')')) {
	    	   System.out.println("Bracket is right");
	    	   match = true;
	    } else {
	          System.out.println("Bracket Mismatch");
	    	  match = false;
        }
	    return match;		
	}
}

	
	



	
		
		