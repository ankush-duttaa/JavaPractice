package collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetStudent {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 1 for hashset \n 2 for tree set \3 for treeset with roll \4 treeset with name");
		
		System.out.println("Enter your choice: ");
		
		int choice = Integer.valueOf(br.readLine());
		
		switch(choice) {
		case 1 : System.out.println("hashset");
		         hashSetExample();
		         break;
		case 2:  System.out.println("Treeset");
			     treeSetExample();
			     break;
		}
		//
		//
		//treeSetWithRollComparator();
		//treeSetWithNameComparator();
	}
	
	public static void hashSetExample() {


		HashSet<Student> set = new HashSet<Student>();

		Student S1 = new Student(1, "A");
		Student S2 = new Student(2, "B");
		Student S3 = new Student(3, "c");
		Student S4 = new Student(5, "D");
		Student S5 = new Student(4, "x");
		Student S6 = new Student(6, "E");
		Student S7 = new Student(7, "F");
		Student S8 = new Student(11, "G");
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

		// System.out.println(+set); I need to print without for loop please help\\
		for (Student s : set) {
			System.out.println(s.roll + " " + s.name);
		}		
	}
	
	public static void treeSetExample() {
		TreeSet<Student> set = new TreeSet<Student>();
		Student S1 = new Student(1, "A");
		Student S2 = new Student(2, "B");
		Student S3 = new Student(3, "c");
		Student S4 = new Student(4, "x");
		Student S5 = new Student(5, "D");		
		Student S6 = new Student(6, "E");
		Student S7 = new Student(7, "F");
		Student S8 = new Student(8, "G");
		Student S9 = new Student(9, "G");
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

		// System.out.println(+set); I need to print without for loop please help\\
		for (Student s : set) {
			System.out.println(s.roll + " " + s.name);
		}

	}
	
	public static void treeSetWithRollComparator() {
		
		StudentComparatorWithRoll com = new StudentComparatorWithRoll();
		
		TreeSet<Student> set2 = new TreeSet<Student>(com);

		Student S1 = new Student(1, "A");
		Student S2 = new Student(2, "B");
		Student S3 = new Student(3, "c");
		Student S4 = new Student(4, "x");
		Student S5 = new Student(5, "D");		
		Student S6 = new Student(6, "E");
		Student S7 = new Student(7, "F");
		Student S8 = new Student(8, "G");
		Student S9 = new Student(9, "G");
		Student S10 = new Student(7, "H");
		set2.add(S1);
		set2.add(S2);
		set2.add(S3);
		set2.add(S4);
		set2.add(S5);
		set2.add(S6);
		set2.add(S7);
		set2.add(S8);
		set2.add(S9);
		set2.add(S10);

		// System.out.println(+set); I need to print without for loop please help\\
		for (Student s : set2) {
			System.out.println(s.roll + " " + s.name);
		}	
	}
	
public static void treeSetWithNameComparator() {
		
		StudentComparatorWithName com = new StudentComparatorWithName();
		
		TreeSet<Student> set2 = new TreeSet<Student>(com);

		Student S1 = new Student(1, "A");
		Student S2 = new Student(2, "B");
		Student S3 = new Student(3, "c");
		Student S4 = new Student(5, "D");
		Student S5 = new Student(4, "x");
		Student S6 = new Student(6, "E");
		Student S7 = new Student(7, "F");
		Student S8 = new Student(11, "G");
		Student S9 = new Student(12, "G");
		Student S10 = new Student(7, "H");
		set2.add(S1);
		set2.add(S2);
		set2.add(S3);
		set2.add(S4);
		set2.add(S5);
		set2.add(S6);
		set2.add(S7);
		set2.add(S8);
		set2.add(S9);
		set2.add(S10);

		// System.out.println(+set); I need to print without for loop please help\\
		for (Student s : set2) {
			System.out.println(s.roll + " " + s.name);
		}	
	}

}



class Student implements Comparable<Student>{
	int roll;
	String name;

	public Student(int R, String N) {
		roll = R;
		name = N;

	}

	@Override
	public int compareTo(Student o) {
		return this.roll - o.roll;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		System.out.println("hashcode:" + result);
		return result;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}
	
	
}

class StudentComparatorWithRoll implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.roll - o2.roll;
	}	
}

class StudentComparatorWithName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}	
}
