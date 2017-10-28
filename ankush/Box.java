public class Box{

int h;
int w;
int d;
}

public class Main{
public static void main(String[] args){
Box box1 = new Box();
System.out.println("Height=" +box1.h);
box1.h=10;
box1.w=15;
box1.d=5;
System.out.println("Height=" +box1.h);
System.out.println("Wedith=" +box1.w);
System.out.println("Depth =" +box1.d);
Box box2 = new Box();

System.out.println("Height=" +box2.h);
box2.h=20;
box2.w=30;
box2.d=10;
System.out.println("Wedith=" +box2.w);
System.out.println("Depth =" +box2.d);
}
}