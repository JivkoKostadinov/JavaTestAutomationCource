import java.util.ArrayList;
import java.util.Scanner;


public class Problem6 {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
		
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();
		int thirdNumber = sc.nextInt();
		
		ArrayList<Integer> euroList = new ArrayList<Integer>();
		
		euroList.add(firstNumber);
		euroList.add(secondNumber);
		euroList.add(thirdNumber);
		
		firstNumber = euroList.get(1);
		secondNumber = euroList.get(2);
		thirdNumber = euroList.get(0);
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		System.out.println(thirdNumber);
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
