public class Box2{
int h;
int w;
int d;
public void volume(){
int vol=h*w*d;
System.out.println("Height=" +vol);
}
}

public class main{

public static void main (String[] args){

Box box1= new Box();

box1.h=10;
box1.w=15;
box1.d=35;
box1. volume();

}
}
