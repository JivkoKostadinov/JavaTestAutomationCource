
public class ComputerDemo {

	public static void main(String[] args) {
		
		Computer Lenovo = new Computer();
		
		Lenovo.year = 2014;
		Lenovo.price = 100;
		Lenovo.operationSystem = "Vista";
		Lenovo.isNoteBook = true;
		Lenovo.hardDiskMemory = 400;
		Lenovo.freeMemory = 220;
		
		Computer Toshiba =  new Computer();
		
		Toshiba.year = 2011;
		Toshiba.price = 140;
		Toshiba.operationSystem = "Linux";
		Toshiba.isNoteBook = false;
		Toshiba.hardDiskMemory = 420;
		Toshiba.freeMemory = 220;
		
		System.out.println("Free memory on my Lenovo computer is :" + Lenovo.freeMemory );
		Lenovo.useMemory(100);
		System.out.println("After call method my memory on Lenovo computer is :" + Lenovo.freeMemory );
		System.out.println("My Operation System on my Toshiba computer is :" + Toshiba.operationSystem );
		Toshiba.changeOperationSystem("Vista Service pack 3");
		System.out.println("After call method my Operation System on Lenovo computer is :" + Lenovo.operationSystem );
		
		
		

	}

}