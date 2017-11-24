import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class brac{
	
	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the whole String: ");
    String value = br.readLine();
	char arr[]=value.toCharArray();
	int size=arr.length;
	Stack14 s = new Stack14 (size);
	char a1=arr[0];
	

	if (a1=='[' ||
	    a1=='{' ||
		a1=='(' )
		{
		 s.push(a1);
		}
		else if (a1==']' ||
	    a1=='}' ||
		a1==')' )
	{ char x=a1;
	  char y=s.pop();
	           
      char a2=arr[1];





      if (a2=='[' ||
	    a2=='{' ||
		a2=='(' )
		{
		 s.push(a2);
		}
		else if (a2==']' ||
	    a2=='}' ||
		a2==')' )
	{ char z=a2;
	  char p=s.pop();			   
	  
	  
	   
	if ((x== '[' && y== ']')||
	   (x== '{' && y== '}')||
	   (x== '(' && y== ')'))
	  if ((z== '[' && p== ']')||
	   (z== '{' && p== '}')||
	   (z== '(' && p== ')'))
	   {
	   
		   
	System.out.println("Bracket match");

	
	}
	else {
	System.out.println("Bracket Mismatch");
    }
	}
	}
	}
}
	