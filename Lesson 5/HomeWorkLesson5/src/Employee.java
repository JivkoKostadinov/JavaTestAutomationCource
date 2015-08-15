
public class Employee extends Person {

	double daySalary;
	double dailySum = 0 ;
	
	void Employee(){
		
		this.name = name;
		this.age = age;
		this.isMan = isMan;
		this.daySalary = daySalary;
		
		
	}
		
	double calculateOverTime(double hours){
			
			if (this.age > 18) {
				
				this.daySalary= 0;

			}else if (hours > 8 ) {
				
				return this.daySalary;
				
			}else if (hours < 8 ) {
				
				 dailySum = daySalary / 8;
				 
				 dailySum= dailySum * 1.5;
				

			}
			
			
			return  dailySum;
			
		}
	
	void showEmployeeInfo(){
		
		System.out.println("My name is : " + this.name);
		System.out.println("My age is : " + this.age);
		System.out.println("Am i a man  : " + this.isMan);
		System.out.println("My daily salary is  : " + this.daySalary);
		System.out.println("My over time  salary is  : " + dailySum);
		
		
		
		
	}
	
	
	
	
	
}
