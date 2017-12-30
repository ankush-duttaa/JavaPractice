/*Sum of value without Max and Min*/

public class NewSum{
   public static void main(String args[]){

int arr[] = {2,5,8,10,15};
int max = arr[0];
int min=arr[0];
int sum=0;

for(int i=0; i<arr.length;i++){
sum= sum+arr[i];

if(arr[i]>max){
  max=arr[i];
}if( arr[i]<min){
min =arr[i];
}

}
System.out.println("Max value is  "+ max);
System.out.println("Max value is  "+ min);
System.out.println("The Sum of total array is  "+ sum); 

int w=(sum-(max+min));
System.out.println("The Sum of array  array without max and min  "+ w); 

}
}