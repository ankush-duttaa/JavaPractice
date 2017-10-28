public class Box2{
   int h;
   int w;
   int d;
   
   public int volume(){
     int vol=h*w*d;
     System.out.println("Height=" +vol);
	 return vol;
   }
}

 class main{
	 
     public static void main (String[] args){     
           Box2 b2= new Box2();
           
           b2.h=10;
           b2.w=15;
           b2.d=35;
           int volume = b2.volume();
     }
}
