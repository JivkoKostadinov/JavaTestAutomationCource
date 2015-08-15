package Lecture7;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {

		double [] arrayNumber = new double[10];
		
		for (int i = 0; i < arrayNumber.length; i++) {
			
			arrayNumber[i]= i * 3;
			
		}
		
		System.out.println(Arrays.toString( arrayNumber).replace("[", " ").replace("]", " "));

	}

}
