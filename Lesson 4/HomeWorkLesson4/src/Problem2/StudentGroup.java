package Problem2;



public class StudentGroup {

	String groupSubject;
	int freePlaces;
	String[] students;
	//int[] studentGrade;
	
	
	StudentGroup(){
		
		this.students = new String[5];
		this.freePlaces = students.length-1;
		//this.studentGrade = new int[students.length];

	}
	
	 StudentGroup(String subject){
		 this();
		 this.groupSubject= "IT";
		 
	 }
	
	
	 void addStudent(Student subject){
		 for (int i = 0; i <= students.length-1; i++) {
			 if (this.groupSubject.equals(subject.subject) && this.freePlaces > students.length-1) {
				 if (this.freePlaces > 0) {
				  students[i] = subject.toString();
				  i++;
				  this.freePlaces--;
				  
				 }
		 }
		}
		
	 }
	
	 void emptyGroup() {
		 
		 this.students = new String[5];
		 this.freePlaces = 5;
		 
	 }
	 
	 String theBestStudent() {
		 
		 
		 
		 
		 
		 return "";
	 }
	 
	 
	 
	 
	 
}

	
