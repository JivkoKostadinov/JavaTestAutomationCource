import java.util.Scanner;


public class Problem3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		
		
		System.out.println("Before transformation the number is : ");
		System.out.print("First Number :  "+ firstNumber + "Second Number " + secondNumber  );
		
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("After transformation the number is : ");
		System.out.print("First Number :  "+ firstNumber + "Second Number " + secondNumber  );
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

	private static void swap(int firstNumber, int secondNumber) {
		// TODO Auto-generated method stub
		
	}

}
