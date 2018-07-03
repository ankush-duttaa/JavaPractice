import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*Position check of an particulr array Value */
public class Positioncheck{
	
	public static void main(String [] args) { 
		int arr[] = {1,4,10,15,3,2,7};

		
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]==15){
			System.out.println("The arr[i] position of 15 is : "+i);
			break;
		}
	}
		
	
	}
}

	
	
	
	
 