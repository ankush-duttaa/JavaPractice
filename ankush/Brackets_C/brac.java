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
	System.out.println("size:" + size);
	Stack14 s = new Stack14 (size);
	char x;
	char y;
	
	for (char i=0;i<arr.length;++i){//for loop started
		
	if (arr[i]=='[' ||arr[i]=='{' ||arr[i]=='(' ){
		 System.out.println("arr[i]=" + arr[i]);
		 s.push(arr[i]);
	} else if (arr[i]==']' || arr[i]=='}' || arr[i]==')' ){ 
	     System.out.println("arr[i]=" + arr[i]);
	     x=arr[i];
	     y=s.pop();
		 boolean match2 = isBracketMatch(x, y);
	}
	boolean empty = s.isEmpty();
	System.out.println("arr[i]=" + arr[i]);
	if(empty == false) {
		System.out.println("Bracket Mismatch");
	}
	
  }//for loop ends
 }//main ends
 
 public static boolean isBracketMatch(char x, char y) {
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
}//class ends
	