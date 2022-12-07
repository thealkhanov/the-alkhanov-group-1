package constructor_overloading;

public class Student {

	int age;
	String name;

	public Student (int age) {
		this.age=age;
	}

	public Student() {
		
	}
	
	public Student (int age, String name) {
		this.age=age;
		this.name=name;
	}
	
}
