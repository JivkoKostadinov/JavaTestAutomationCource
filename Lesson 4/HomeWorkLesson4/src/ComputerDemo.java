
public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer Lenovo;
		Lenovo = new Computer(2001,345.15,false,400.45,120.45,"Vista");
		
		Computer Dell;
		Dell =  new Computer(2011,645.15,true,800.45,420.45,"XP");
		
		//Dell is more expensive
		System.out.println(Lenovo.compare(Dell));
		


	}

}
