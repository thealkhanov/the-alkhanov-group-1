package inheritance;

public class HP extends Computer {
	String color;
	
	
	public void printInfo() {      //Computer-dəki printInfo metodu + burda əlavə etdiyim kod (color)
		super.printInfo();         //Computer sinifində olan printInfo metodu
		System.out.println("Rəngi: "+color);
		//System.out.println("Üst sinifin dəyişəninə müraciət: "+super.operationSystem);
	}
	
}
