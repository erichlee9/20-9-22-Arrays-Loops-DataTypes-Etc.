package eg4;

public class Student {
	
	int id;
	String name;
	int age;
	final static String college="Revature College";
	
	public void printStudent() {
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
		System.out.println("College Name "+college);
	}
}
