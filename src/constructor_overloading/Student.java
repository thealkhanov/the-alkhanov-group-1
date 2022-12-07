package constructor_overloading;

public class Student {

	int age;
	String name;
	String surname;

	public Student() {
		this(8);
	}
	
	
	public Student (int age) {
		this(age,"Ziya");
	}

	
	public Student (int age, String name) {
		this(age,name,"Yaqublu");
	}
	
	public Student (int age, String name, String surname) {
		this.age=age;
		this.name=name;
		this.surname=surname;
	}
	
	public void printAllInfo() {
		System.out.println("----------------------");
		System.out.println("age: "+age);
		System.out.println("name: "+name);
		System.out.println("surname: "+surname);
		
	}
}
