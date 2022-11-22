package class_objects;

public class MainObjectCreating {
	public static void main(String[] args) {
		
		Car audi = new Car();
		audi.speed=380;
		audi.color="Black";
		audi.wheelCount=4;
		
		Car tesla = new Car();
		tesla.speed=450;
		tesla.color="White";
		
		
		System.out.println("Audi speed: "+audi.speed);
		System.out.println("Audi color: "+audi.color);
		System.out.println("Audi wheel count: "+audi.wheelCount);
		
		
		System.out.println();
		System.out.println("Tesla speed: "+tesla.speed);
		System.out.println("Tesla color: "+tesla.color);
		
	}
}
