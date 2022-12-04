package scanner;

import java.util.Scanner;

public class ScannerRadiusExample {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Cevrenin radiusunu daxil edin:");
		double radius = input.nextDouble();  //istifadeci daxil edecek
		double cevreninUzunlugu= 2*Math.PI*radius; //2*pi ededi*radius
		System.out.println("Cevrenin uzunlugu: "+cevreninUzunlugu);
	}

}
