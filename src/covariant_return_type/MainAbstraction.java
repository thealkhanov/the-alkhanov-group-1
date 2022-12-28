package covariant_return_type;

public class MainAbstraction {

	public static void main(String[] args) {
		
		
	}

	static Car giveMeCar() {
		Honda h = new Honda();
		return h;
	}
	
}
