import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays; 
/*Reverse An Array*/
public class Swip{
	
	public static void main(String [] args) { 
		int arr[] = {10,5,17,19,2,3};
	
	for(int i=0; i<arr.length/2; i++)
	{
		int temp =arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]= temp;
	System.out.println("Total array size is :" + arr[i]);
	}
	
    System.out.println("Arr is "  +Arrays.toString(arr));

	
	}
	
}
	
	
	
	
 