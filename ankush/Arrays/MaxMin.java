import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*Max Min check  */
public class MaxMin{
	
	public static void main(String [] args) { 
		int arr[] = {1,4,10,15,0,2,7};
         int max =arr[0];
          int min=arr[0];		 
		
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]>max){
			max =arr[i];
		}if(arr[i]<min){
			min =arr[i];
		
		}
	}
			System.out.println("Max value of the array is  : " +max);
			System.out.println("Min value of the array is   : " +min);

		
		

	}
}


	
	
	
	
 