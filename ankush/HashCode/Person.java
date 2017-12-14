public class Person {
int age;

 public int hashCode() {
  int hashcode = age;
  return hashcode;
} 

public boolean equals(Person p) {
	if(age == p.age) {
		return true;
	} else {
		return false;
	}

}
public static void main(String args[]) {
	//object 1
	Person p1 = new Person();
	p1.age = 10;
	System.out.println("p1 hascode: " + p1.hashCode());
	//object 2
	Person p2 = new Person();
	p2.age = 10;
	System.out.println("p2 hascode: " + p2.hashCode());
	boolean test = p1.equals(p2);
	System.out.println("p1 equals p2?: " + test);
}
}