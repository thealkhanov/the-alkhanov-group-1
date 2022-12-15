package enum_examples;

public class MainClass {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Eltac";
		s1.id = 1;
		s1.gender = Cins.MALE;
		System.out.println("s1-in name-i: "+s1.name);
		System.out.println("s1-in genderi: "+s1.gender.i);
		
		Student s2 = new Student();
		s2.name = "Aynur";
		s2.id = 2;
		s2.gender = Cins.FEMALE;
		System.out.println("s2-nin name-i: "+s2.name);
		System.out.println("s2-nin genderi: "+s2.gender.i);
	}

}
