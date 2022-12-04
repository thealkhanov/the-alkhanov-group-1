package scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adýnýzý daxil edin:");
		String name=sc.nextLine();
		System.out.println("Salam, "+name);
		
		System.out.println("Yaþýnýzý daxil edin:");
		int age=sc.nextInt();
		System.out.println("Salam, yaþýnýz: "+age);
		
		sc.close();
	}

}
