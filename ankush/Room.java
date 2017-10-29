
public class Room{
	int l;
	int w;
	int h;
	

           public void volume (){
                 
            System.out.println("Lenth is =" +l );
			System.out.println("Width is =" +w );
            System.out.println("Heightis =" +h ); 
            int vol=l*w*h; 
		    System.out.println("The Room Volume is =" + vol );	
            }	
            
          public int calculation(){
                 int sq=l*w;
				 return sq;
           	  
            }
}