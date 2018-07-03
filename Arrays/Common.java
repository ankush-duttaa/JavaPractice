import java.util.Arrays; 
import java.util.Arrays; 
public class Common{
   public static void main(String args[]){

int arr[] = {10,15,25,35,45,55,65};
int arr2[] = {10,75,85,35,65,100,25,};

for(int i=0; i<arr.length;i++){
 for (int j=0;j<arr2.length;j++)


if(arr[i]==arr2[j]) {
System.out.println("common value is " + arr[i]);

 }
}
 System.out.println("common value is "  +Arrays.toString(arr2));

}
}