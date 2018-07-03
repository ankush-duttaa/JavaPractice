import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*Avg of array*/
public class Avg{
	
	public static void main(String [] args) { 
		int arr[] = {1,2,3,4,5};
int Sum=0; int avg=0;
		
	for(int i=0; i<arr.length; i++)
	{
		Sum= Sum+arr[i];
		avg=Sum/arr.length;
	}
		System.out.println("Avg of the Array is  :" + avg);
	
	}
}

	
	
	
	
 