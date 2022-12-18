package inheritance;

public class Computer {

	String operationSystem;
	String model;
	String prosessor;
	int RAM;
	double hardDisk;
	
	
	public void printInfo() {
		System.out.println("Əməliyyat sistemi: "+operationSystem);
		System.out.println("Model: "+model);
		System.out.println("Prosessor: "+prosessor);
		System.out.println("Operativ yaddaş (RAM): "+RAM);
		System.out.println("Hard disk (toplayıcı): "+hardDisk);	
	}
	
}
