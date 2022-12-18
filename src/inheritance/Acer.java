package inheritance;

public class Acer extends HP{
	int weight;
	
	public void printInfo() {    
		super.printInfo();       
		System.out.println("Ağırlığı: "+weight);
		
	}
}
