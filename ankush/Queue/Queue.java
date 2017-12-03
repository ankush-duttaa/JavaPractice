public class Queue {
	char F;
	int R;
	char [] arr; 
	
	
	public Queue(int size) {
		System.out.println("Queue size: " + size);
		arr = new char [size]; 
		F = -1;
		R= -1;
		
	}
	
	public char Insert(char x) { /*method bracket start*/
		 
		 if(R == arr.length-1){
			
			System.out.println("Queue is Full");
			return x;
		 }
		if(R == -1 && F== -1){
			R=R+1;
			F=F+1;
		  }else {
		  R=R+1;
		  } 
		
		 arr[R]= x;
		 System.out.println("Insert Charecter is :- " + x);
		  return x;
	}/*method bracket closed*/
		  
    public char Remove(){
      if (R == -1){
		  System.out.println("Nothing to Remove");
		return 0;
	  }
			 
           char y= arr[F];
		   System.out.println("Remove Charecter is :-" + y);
		  if (F == R){
			  F=F-1;
		      R=R-1;}
		  else {
			   for(char i=(char) F; i<R; i ++)
				 arr[i]=arr[i+1];/*unable to understand*/
               R = R-1;
		 
		  }
		   return y;

	  }


	
	}	/*class closed*/

