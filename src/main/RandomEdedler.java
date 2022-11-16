package main;

import java.util.Random;

public class RandomEdedler {
public static void main(String[] args) {
	
	//Random r= new Random();
	//int tesadufiEded= r.nextInt();
	//System.out.println("Təsadüfi ədəd: "+tesadufiEded);
	
	Random r=new Random();
	int a=r.nextInt();
	int a2=r.nextInt(6);  //bound
	int a3=r.nextInt(1, 10);
	
	System.out.println("Random int: "+a);
	System.out.println("Şərtləndirdiyimiz int: "+a2);
	System.out.println("Origin and bound int: "+a3);
	System.out.println("_______________________________");
	
	double b=r.nextDouble();
	double b1=r.nextDouble(1.5);
	double b2=r.nextDouble(1.4, 1.6);
	System.out.println("Random double b: "+b);
	System.out.println("Şərtləndiryimiz (bound) double b1: "+b1);
	System.out.println("origin and bound double b2: "+b2);
}
}
