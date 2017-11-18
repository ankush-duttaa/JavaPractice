public class Heart{
	public static void main(String[] args){
	
	Brain b = new Brain();
	b.t =Integer.parseInt(args[0]);
	b.i =Integer.parseInt(args[1]);
	b.time();
	b.wake();
	
	int i = b.wake();
	System.out.println("wakeup");
	System.out.println("no wakeup");
    }
}