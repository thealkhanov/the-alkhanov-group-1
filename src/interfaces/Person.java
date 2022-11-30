package interfaces;

public class Person implements Eatable{

	@Override
	public void eat() {
		
		System.out.println("Men yemek yeyirem.");
		
	}

	@Override
	public void run() {
		
		System.out.println("Men qaciram");
	}

}
