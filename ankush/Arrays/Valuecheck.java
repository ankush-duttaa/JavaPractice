import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*check the particualr value in an Array */
public class Valuecheck{
	
	public static void main(String [] args) { 
		int arr[] = {1,4,10,15,3,2,7};

		
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]==15){
			System.out.println("The value is found ");
			break;
		}
	}
		
	
	}
}

	
	
	
	
 