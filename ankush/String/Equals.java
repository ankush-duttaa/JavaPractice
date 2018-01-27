public class Equals {
	public static void main(String[] args) {
	
		String s1="Ankush";
	    String s2="Ankush";
		if(s1 == s2){
			System.out.println("equal check is ok T1 : " );
		}
		s1.equals(s2);
		System.out.println("equal check is ok T2  : " );
		
		String s3= new String("Dutta");
		String s4= new String("Dutta");
		
		if(s3 == s4){
			System.out.println("Old foramat equal check is ok T3 : " );//This is not print as This object is differsent
		}
		s3.equals(s4);
		System.out.println("Old foramat equal check is ok T4 : " );
	}
	
}

