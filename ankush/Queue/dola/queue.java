public class queue {
	int f;
	int r;
	char [] arr; 
	
	
	public queue(int size) {
		System.out.println("Queue size: " + size);
		arr = new char [size]; 
		f = -1;
		r= -1;
		
	}
	
	public char Insert(char x) { /*method bracket start*/
		 
		 if(r == arr.length-1){
			
			System.out.println("Queue is Full");
			return x;
		 }
		if(r == -1 && f== -1){
			r=r+1;
			f=f+1;
		  }else {
		  r=r+1;
		  } 
		
		 arr[r]= x;
		 System.out.println("Insert Charecter is :- " + x);
		  return x;
	}/*method bracket closed*/
		  
    public char Remove(){
      if (r == -1){
		  System.out.println("Nothing to Remove");
		return 0;
	  }
			 
           char y= arr[f];
		   System.out.println("Remove Charecter is :-" + y);
		  if (f == r){
			  f=f-1;
		      r=r-1;}
		  else {
			   for(char i=(char) f; i<r; i ++)
				 arr[i]=arr[i+1];
               r = r-1;
		 
		  }
		   return y;

	  }


	
	}	/*class closed*/

