public class Queue {
	int R=-1;
	int F=-1;
	char  arr[]; 
	
		
	
	
	
	public char Insert(char x) { /*method bracket start*/
		 System.out.println("Insertl: " + x);
		if(R == -1){
			R=R+1;
			F=F+1;
		  }else {
		  R=R+1;
		  } 
		   System.out.println("Insert2: " + x);
		  arr[R]=x;
		  return x;
	}/*method bracket closed*/
		  
			
	}	/*class closed*/

