import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SIZE{
	
	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the whole String: ");
    String value = br.readLine();
	char arr[]=value.toCharArray();
	int size=arr.length;
	System.out.println("Total array size is :" + size);
	int space = 0;
	int letter = 0;
	int num = 0;
    int upper =0;

	for (char i=0;i<arr.length;i++)
		
		{
				
            if(Character.isWhitespace(arr[i])) {
				space=space+1;
			}
	          else if(Character.isLetter(arr[i])){
				 letter=letter+1;
		      }
			   else if (Character.isDigit(arr[i])){
				num= num+1;
			   }
			   else if(Character.isUpperCase(arr[i])){
				upper= upper+1;
			   }
			   
		      }
		
	           System.out.println("Total number of Spaces in a given String are: " +space);
	           System.out.println("Total number of letter in a given String are: " +letter);
               System.out.println("Total number of num in a given String are: " +num);
			   int sum =space+letter+num;
			   System.out.println("Total SUM: " +sum);
			    System.out.println("Total Upper case : " +upper);
			   if(size == sum){
				   System.out.println("Input and out put match" );
			   }
			   else{
				   System.out.println("Input and out put Not match");
			   }
   }
}

