

public class Student extends Person {

	protected  double score;
	
	Student(String name, int age, boolean isMan, double score){
		
		this.name = name;
		this.age = age;
		this.isMan= isMan;
		this.score= score;
		
	}
	
	 void showStudentInfo(){
		 
		    System.out.println(this.name);
			System.out.println(this.age);
			System.out.println(this.isMan);
			System.out.println(this.score);
	 }
	
}
