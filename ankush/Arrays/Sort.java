import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

/*Sort An Array*/
public class Sort{
	public static void main(String [] args) { 
	int arr[] = {1,4,10,15,3,2,7};
	for(int i=0; i<arr.length; i++)
		for( int j=1; j<arr.length-1; j++)
	{
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	
		
	}
		System.out.println("After SORT new Array is  : " +Arrays.toString(arr));
	}
	
}
	
/*not sort */

	
	
	
 