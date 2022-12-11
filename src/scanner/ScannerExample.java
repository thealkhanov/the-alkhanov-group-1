package scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adınızı daxil edin:");
		String name=sc.nextLine();
		System.out.println("Salam, "+name+" bəy.");
		
		System.out.println("Yaşınızı daxil edin:");
		int age=sc.nextInt();
		System.out.println("Salam, yaşınız: "+age+"-dir");
		
		sc.close();
	}

}
