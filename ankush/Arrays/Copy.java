import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays; 
/*Copy of array*/


public class copy {
 public static void main(String[] args) {
   int[] src = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   int[] des = new int[10];     
 
   
   for(int i=0; i < src.length; i++) {
    des[i] = src[i];
}
   System.out.println("New Array: "+Arrays.toString(des));
 }
 }
	
	
	
 