package abstraction_example;

public class MainAbstraction {

	public static void main(String[] args) {

		Honda h1=new Honda();
		h1.driving();
		h1.makeSound();
		
		System.out.println();
		Car c1=new Honda();
		c1.driving();
		
	}

}
