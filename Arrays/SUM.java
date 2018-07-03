import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*Sum of array*/
public class SUM{
	
	public static void main(String [] args) throws IOException{
		
	
	int arr[]=getInputAsIntArray();
	
	int size=arr.length;
	System.out.println("Total array size is :" + size);
	 int Sum=0;
	for(int i=0; i<arr.length; i++)
	{
		Sum= Sum+arr[i];
	}
		System.out.println("Sum of the Array is  :" + Sum);
	
	}
	
	public static int[] getInputAsIntArray() throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the whole String: ");
		
    String value = br.readLine();
	
	String[] num = value.split(",");
	
	int arr[] = new int[num.length];
	for(int i=0; i< num.length ; i++) {
		arr[i] = Integer.parseInt(num[i]);
	}
    
	return arr;
   }	
	
}
	
	
	
	
 