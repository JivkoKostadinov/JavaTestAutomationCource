package Lecture7;

import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array :");
		int number = sc.nextInt();
		System.out.println("Enter value of the element of the array :");
		
		//add input number in to array
		int [] arrayNumber = new int[number];
		
		for (int i = 0; i < arrayNumber.length; i++) {	
			
			arrayNumber[i] = sc.nextInt();
			
		}
		

		int[] reverseArray = new int[number];
		
        for (int i = arrayNumber.length - 1; i > -1; i--) {	
			
        	reverseArray[arrayNumber.length - i -1] = arrayNumber[i];
			
		}
		
		
        System.out.println(Arrays.toString( reverseArray).replace("[", " ").replace("]", " "));
		
		
		
	}

}
