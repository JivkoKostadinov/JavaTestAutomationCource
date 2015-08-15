import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Problem5 {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
		
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();
		
		
		ArrayList<Integer> euroList = new ArrayList<Integer>();
		euroList.add(firstNumber);
		euroList.add(secondNumber);
		euroList.add(thirdNumber);
		Collections.sort(euroList);
		Collections.reverse(euroList);
		
		int num1 = euroList.get(0);
		int num2 = euroList.get(1);
		int num3 = euroList.get(2);
		
		System.out.print(num1);
		System.out.println(num2);
		System.out.print(num3);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
