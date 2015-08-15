package Lecture7;

import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		
		      //read from input
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter size of the array :");
				int number = sc.nextInt();
				System.out.println("Enter value of the element of the array :");
				
				//add input number in to array
				int [] arrayNumber = new int[number];
				
				for (int i = 0; i < arrayNumber.length; i++) {	
					
					arrayNumber[i] = sc.nextInt();
					
				}
		
				int bestSeq = 1;
				int currSeq = 1;
				int bestNum = 0;
				
				for (int i = 0; i < arrayNumber.length; i++) {
					
					if (arrayNumber[i] == arrayNumber[i + 1]) {
						
						currSeq ++;
					}else{
						
						currSeq= 1;
					}if (currSeq >= bestSeq ) {
						
						bestSeq = currSeq;
						bestNum = arrayNumber[i];
	
					} 

					}
					

	          for (int i = 0; i < bestSeq; i++) {
			
				System.out.println(" " + bestNum);
	          }
				
				

	}
}

