import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Reverse{

	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the whole String: ");
	
    String value = br.readLine();
	char arr[]=value.toCharArray();
	int size=arr.length;
	System.out.println("size:" + size);
	Stack14 s = new Stack14(size);
	char x;
	char y;
	
	for (char i=0;i<arr.length;++i){//for loop started

     s.push(arr[i]);
	 	x=arr[i];
	}
	   y=s.pop();
	  System.out.println("Pop value is "+y);
	 y=s.pop();
	 System.out.println("Pop value is "+y);
	 y=s.pop();
	 System.out.println("Pop value is "+y);
	 

	}
	
}
	

	
	
	
 