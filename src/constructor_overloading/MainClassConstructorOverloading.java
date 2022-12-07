package constructor_overloading;

public class MainClassConstructorOverloading {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println("default s yash: "+s.age);
		
		Student s1 = new Student(12);
		System.out.println("s1 yash: "+s1.age);
		
		Student s2 = new Student(14, "Elnur");
		System.out.println("s2 name: "+s2.name);
		System.out.println("s2 yash: "+s2.age);
	}

}
