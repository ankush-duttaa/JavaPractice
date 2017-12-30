import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays; 

/*Sort by  Zero  */
public class SortZero{
	
	public static void main(String [] args) { 
		int arr[] = {0,0,1,2,3,0};
         int start = arr[0];
		 int end = arr[length];
	for(int i=0; i<arr.length; i++)
	 
	{
		if (start == 0 && end == 0){
		arr[i]= arr[i+1];
		}else if(start != 0  | end == 0){
			arr[i]= arr[i+1];
		}	
			System.out.println("Max value of the array is  : " +arr[i]);
	}
		
		System.out.println("common value is "  +Arrays.toString(arr));

		

	}
}


	
	
	
	
 