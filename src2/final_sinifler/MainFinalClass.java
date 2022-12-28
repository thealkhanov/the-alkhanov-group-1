package final_sinifler;

public class MainFinalClass {

	public static void main(String[] args) {

		Car[] cars = new Car[3];
		cars[0] = new Honda();
		cars[1] = new Kia();
		cars[2] = new BMW();
		
		for (Car car : cars) {
			car.driving();
		}
		
		
		
		/*Honda h1=new Honda();
		h1.driving();
		h1.makeSound();
		
		System.out.println();
		Car c1=new Honda();
		c1.driving();*/
		
	}

}
