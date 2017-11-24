
public class Car {
	
       int price;
	   int capacity;
       String colour;
	   
	   car ( String colour){
	   this.capacity=cap;
	   this.price =p;
	   this.colour=c;}
	   
       car (int capacity){
		 this.capacity=capacity;
	   this.price =p;
	   this.colour="Blue";}  
	   
	   car(){
	   }
}

public class Show{
	
	public static void main(String [] args) {
		
		Car c1 = new car(10);
		car c2 = new car("Red",10);
		car c3 = new car();
	}
		
		