import java.util.Scanner;


public class Problem7 {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		float money = sc.nextFloat();
		boolean isSeek = sc.nextBoolean();
		
		if (hour > 20 && hour < 7 ) {
			if (money == 0 && isSeek == true ) {
				
				System.out.println("����� ���,������ �������...");
			}else if (money > 0 && isSeek == false) {
				
				System.out.println("�� �� ���� �� ������ ....");
				
			}else if (money < 10 && isSeek == true){
				
				System.out.println("������ ���� �� ������� �� ��������� ....");
		
			}else if (money > 10 && isSeek == true){
			  
				System.out.println("������ �� ������� �� ��������� ....");
			}else if (hour < 20 && hour > 7 && money > 50 && isSeek == false ){
				
				System.out.println("�� �� ���� �� ���������.....");
		
			}

			
		}
	

	}

}
