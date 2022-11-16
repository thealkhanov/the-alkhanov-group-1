package main;

import java.util.Arrays;

public class ArraysSinifi {
public static void main(String[] args) {
	
	int [] myArray = {20,14,6,18,25};
	
	System.out.println(Arrays.toString(myArray));
	Arrays.sort(myArray);
	System.out.println(Arrays.binarySearch(myArray, 25));
	System.out.println(Arrays.toString(myArray));
	
	Arrays.fill(myArray, 77);
	System.out.println(Arrays.toString(myArray));

}
}
