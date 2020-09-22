package eg4;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.id=100;
		s1.name="Xavier";
		s1.age=33;
		//Student.college="My College";
		System.out.println("Printing Student s1");
		s1.printStudent();
		
		Student s11=new Student();
		s11.id=101;
		s11.name="Chris";
		s11.age=31;
		//Student.college="My College";
		System.out.println("Printing Student s11");
		s11.printStudent();
		
		System.out.println(Math.PI);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		
	}

}
