
public class MainnRoom{
	public static void main(String[] args){
		
	Room r = new Room();
	r.l= Integer.parseInt(args[0]);
	r.w= Integer.parseInt(args[1]);
	r.h= Integer.parseInt(args[2]);
	
	r.volume();
	r.calculation();
	int sq = r.calculation();
	System.out.println("The sq of the room is=" +sq);
	
	}
	
	
}