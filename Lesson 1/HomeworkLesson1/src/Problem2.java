import java.util.Scanner;

public class Problem2 {

	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int firstNumber = sc.nextInt();
	int secondNumber = sc.nextInt();
	
	int sum = firstNumber + secondNumber;
	int subtraction = firstNumber - secondNumber;
	int multiplication = firstNumber * secondNumber;
	int partitionInt = firstNumber / secondNumber;
	float partitionDouble = firstNumber % secondNumber;
	
	
	System.out.println(sum);
	System.out.println(subtraction);
	System.out.println(multiplication);
	System.out.println(partitionInt);
	System.out.println(partitionDouble);
	
	
	
	

	

	}

}
