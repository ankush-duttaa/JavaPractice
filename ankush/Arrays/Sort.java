import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*Reverse An Array*/
public class Swip{
	
	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the whole String: ");
    String value = br.readLine();
	char arr[]=value.toCharArray();
	int size=arr.length;
	System.out.println("Total array size is :" + size);
	
	for(int i=0; i<arr.length/2; i++)
	{
		char temp =arr[i];
		arr[i]=arr[arr.length-i];
		arr[arr.length-i]= temp;
	}
		
	
	}
	
}
	
	/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	at Swip.main(Swip.java:19)*/

	
	
	
 