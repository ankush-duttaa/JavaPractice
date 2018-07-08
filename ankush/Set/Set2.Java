import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set2 {
		public static void main(String[] args){
		     // Create a HashSet
		   HashSet<Integer> hset = new HashSet<Integer>();
		  for(int i=1;i<10000;i++) {
		   
		     //add elements to HashSet
			  hset.add(i);
		  }
			  System.out.println("TreeSet contains: "+hset);
			  
			  System.out.println("time is': "+ System.currentTimeMillis());
				boolean isFound = hset.contains(9999);
				if(isFound == false)
				System.out.println("Element is not found in the Set");
			else
				System.out.println("Element is found in the Set");
				
				
				System.out.println("time is': "+ System.currentTimeMillis());
		  

		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		for(int i=1;i<10000;i++) {
			   
		     //add elements to HashSet
			  tset.add(i);
		  }
			  System.out.println("TreeSet contains: "+hset);
			  
			  System.out.println("time is': "+ System.currentTimeMillis());
				boolean isFound2 = tset.contains(9999);
				if(isFound2 == false)
				System.out.println("Element is not found in the Set");
			else
				System.out.println("Element is found in the Set");
				
				
				System.out.println("time is': "+ System.currentTimeMillis());
		  }
		}


		     