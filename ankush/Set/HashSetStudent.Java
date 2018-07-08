import java.util.*;  
	class Student {  
	      int Roll;  
	      String name;  
	
	   public Student(int R, String N) {  
	      Roll= R;  
	      name = N;  
	    
	                                   }  
	              }  
	public class HashSetStudent {  
	             public static void main(String[] args) {  
	                    HashSet<Student> set=new HashSet<Student>();  
	      
	                           Student S1 = new Student(1, "A");
	                           Student S2 = new Student(2, "B");
		                       Student S3 = new Student(3, "c");
		                       Student S4 = new Student(5, "D");
		                       Student S5 = new Student(4, "x");
	                           Student S6 = new Student(6, "E");
		                       Student S7 = new Student(7, "F");
		                       Student S8 = new Student(11,"G");
		                       Student S9 = new Student(12, "G");
		                       Student S10 = new Student(7, "H");
	                                   set.add(S1);  
	                                   set.add(S2); 
	                                   set.add(S3);  
	                                   set.add(S4);  
	                                   set.add(S5);  
	                                   set.add(S6);  
	                                   set.add(S7);  
	                                   set.add(S8);  
	                                   set.add(S9);
	                                   set.add(S10);
	   
	    //System.out.println(+set); I need to print without for loop please help\\ 
	                          for(Student s :set){  
	                               System.out.println(s.Roll+" "+s.name); 
							                     }

                        /*TreeSet<Student> set2=new TreeSet<Student>();  
	   
	                           Student S11 = new Student(1, "A");
	                           Student S12 = new Student(2, "B");
		                       Student S13 = new Student(3, "c");
		                       Student S14 = new Student(5, "D");
		                       Student S15 = new Student(4, "x");
	                           Student S16 = new Student(6, "E");
		                       Student S17 = new Student(7, "F");
		                       Student S18 = new Student(11,"G");
		                       Student S19 = new Student(12, "G");
		                       Student S20 = new Student(7, "H");
	                                   set2.add(S11);  
	                                   set2.add(S12); 
	                                   set2.add(S13);  
	                                   set2.add(S14);  
	                                   set2.add(S15);  
	                                   set2.add(S16);  
	                                   set2.add(S17);  	
	                                   set2.add(S18);  
	                                   set2.add(S19);
	                                   set2.add(S20);
	    //System.out.println(+set2); I need to print without for loop please help\\ 
	                          for(Student s2 :set2){  
		                          System.out.println(s2.Roll+" "+s2.name); 
	
	                                               } */ 
	                                          }  
	                       }
	
	
