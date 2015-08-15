import java.util.ArrayList;
import java.util.Collections;


public class Problem4 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> euroList = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			euroList.add(i);
			
		}
		Collections.reverse(euroList);
		
		String print = euroList.toString();
		
		System.out.println(print);
		 
		 
				 
		 
		 
		 
		// TODO Auto-generated method stub

	}

}
