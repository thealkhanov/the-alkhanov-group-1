package scanner;

import java.util.Scanner;

public class ScannerRadiusExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Çevrənin radiusunun daxil edin:");
		double radius = input.nextDouble();  //istifadəçi daxil edecek
		double cevreninUzunlugu= 2*Math.PI*radius; //2*pi ededi*radius
		System.out.println("Çevrənin uzunluğu: "+cevreninUzunlugu);
	}

}
