public class Box{
int h;
int w;
int d;
public int volume(){
int volume=h*w*d;
return volume;
}
}

public class main{

public static void main (String[] args){

Box box1= new Box();

box1.h=10;
box1.w=15;
box1.d=35;
int vol =box1. volume();
System.out.println("Height=" +vol);

}
}
