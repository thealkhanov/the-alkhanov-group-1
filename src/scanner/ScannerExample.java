package scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ad�n�z� daxil edin:");
		String name=sc.nextLine();
		System.out.println("Salam, "+name);
		
		System.out.println("Ya��n�z� daxil edin:");
		int age=sc.nextInt();
		System.out.println("Salam, ya��n�z: "+age);
		
		sc.close();
	}

}
