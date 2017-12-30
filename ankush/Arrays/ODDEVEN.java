import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*ODDEVEN Check */
public class ODDEVEN{
	
	public static void main(String [] args) { 
		int arr[] = {10,5,17,19,2,3};
		
     int even =0;
	 int odd =0;
	 
		
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] % 2  ==0){
			even =even+1;
			
            System.out.println("Even value is   : " + arr[i]);
		}else{
		System.out.println("Odd value is   : " + arr[i]);	
      odd=odd+1;
		}
	}
        System.out.println("Even count is   : " + even);
		System.out.println("odd count is  : " + odd);
	
}
}

	
	
	
	
 