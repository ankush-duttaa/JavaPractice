import java.util.*;

	public class HASSET{  
		public static void main(String[] args) {
		     // Create a HashSet
		   HashSet<String> hset = new HashSet<String>();
		 
		     //add elements to HashSet
		     hset.add("Abhijeet");
		     hset.add("Ram");
		     hset.add("Chayanika");
		     hset.add("Kaushik");
		     hset.add("Amal");
		     // Duplicate removed
		     hset.add("Ram"); 
		 
		     // Displaying HashSet elements
		     
		     System.out.println("TreeSet contains: "+hset);
		     
	
			
		
		// Create a TreeSet
	     TreeSet<String> tset = new TreeSet<String>();
	 
	     //add elements to TreeSet
	     tset.add("Abhijeet");
	     tset.add("Ram");
	     tset.add("Chayanika");
	     tset.add("Kaushik");
	     tset.add("Amal");
	     // Duplicate removed
	     tset.add("Ram"); 
	  
	     // Displaying TreeSet elements
	     System.out.println("TreeSet contains: "+tset);
	     
	     
	     
	     
	     //Create a  LinkedHashSet
	     LinkedHashSet<String> lset = new  LinkedHashSet<String>();
	 
	     //add elements to TreeSet
	     lset.add("Abhijeet");
	     lset.add("Ram");
	     lset.add("Chayanika");
	     lset.add("Kaushik");
	     lset.add("Amal");
	     // Duplicate removed
	     lset.add("Ram"); 
	  
	     // Displaying TreeSet elements
	     System.out.println(" LinkedHashSet contains: "+lset);
	     }
	}

	  
	