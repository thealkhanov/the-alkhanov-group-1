package constructor_overloading;

public class MainClassConstructorOverloading {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.printAllInfo();
		
		Student s1 = new Student(12);
		s1.printAllInfo();
		
		Student s2 = new Student(14, "Elnur");
		s2.printAllInfo();
		
	}

}
