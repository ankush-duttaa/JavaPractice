public class Stackr{
	int[] a= new int [10];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	a[5]=6;
	a[6]=7;
	a[6]=8;
	a[7]=9;
	a[8]=10;
	a[9]=11;
	int top =-1;
	int i;

           	public int Push () {
		        
	              int top =top+1;
	              a[i]=top;
	              System.outprintln("Value" +a[i]);
	        }
		      	
	        public int pop (int i) {
	    		  int top =top-1;
	              a[i]=top;
			   
            }
}