import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pal1{
	
	public static void main(String [] args) throws IOException{
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the whole String: ");
    String value = br.readLine();
	char arr[]=value.toCharArray();
	int size=arr.length;
	System.out.println("size:" + size);
	Stack14 s = new Stack14 (size);
	char x;
	char y;
	
	for (char i=0;i<arr.length;++i){//for loop started-
	     s.push(arr[i]);
		 x=arr[i];
		 
	 }
	 
	 char finalArr[] = new char[size];
	 for (char i=0;i<arr.length;++i){//for loop started-
	     y=s.pop();
		 finalArr[i] = y;
		 if (arr[i]== finalArr[i]){
			 System.out.println("ok");
		 }
		 else{
             System.out.println("not ok");	
		 }			 
	 }
	 
  }
}