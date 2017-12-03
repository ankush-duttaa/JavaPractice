class BoxMain{
public static void main(String arg[]){
	box box1=new box();
	int vol;
	box1.w=2;
	box1.h=3;
	box1.l=4;
	int volume=box1.volume();
	System.out.println("vol Test 2" + volume);
}
}