import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays; 
/*Remove one element  check */
public class Remove{
	
	public static void main(String [] args) { 
		int src[] = {1,4,10,15,3,2,7};
		int des[] = new int[src.length-1];

		
	for(int i=0; i<src.length; i++)
	{
		if(src[i] !=15){
			des[i]=src[i];
			System.out.println("After remove the new value is  : " +des[i]);

		}else{
			System.out.println("Remove element position is   : " +i);

		}
	}	
			
			System.out.println("After remove the new array is  : " +Arrays.toString(des));

	
}
}

	
	
	
	
 