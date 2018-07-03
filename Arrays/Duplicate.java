import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*Remove Duplicate */
public class Duplicate{
	
	public static void main(String [] args) { 
		int arr[] = {2,2,5,12,7,8,};
			
	for(int i=0; i<arr.length; i++)
		for(int j=1; j<arr.length; j++)
	{
		if(arr[i] ==arr[j]){
			int duplicate = arr[i];
       System.out.println("Duplicate value is  : " + duplicate);
		}
	 
		}
		

	}
}


	
	
	
	
 