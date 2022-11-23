package methods;

public class MainMethodsParameters {
	public static void main(String[] args) {
		
		MainMethodsParameters m = new MainMethodsParameters();
		m.sayHello(75,"Audi");
		m.sayHello(100, "Okey");
		
	}
	
	public void sayHello(int i, String message) {
		System.out.println(message+", "+i);
		
	}
	
	
}
