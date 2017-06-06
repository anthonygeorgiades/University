package University;

public class Testing {
	
	//start main function 
	public static void main(String args[]){
		Student student1 = new Student("alpha", 2018); //state Student to reference  class created and then define student1, declare their name as Alpha and graduation year as 2018
		student1.takeCourse("cis110"); //set student1's course that they are taking to cis110
		TA ta110 = new TA("beta", "cis110"); //state TA to reference class created and then set the TA's name to beta and the class they ta to cis110 
		ta110.pickOfficeHours("Monday", 3); //let the TA pick their office hours and have them set them as Monday at 3
		ta110.pickRecitationTime(11); //have the TA define their recitation time as as 11 
		student1.assignRecitationTA(ta110); //assign the student to recitation 110
		ta110.gradeStudent(student1, "A"); //ta grades student 1 and gives him/her an A
		student1.printReport(); //print report for student1
		student1.takeCourse("cis120"); //assign the student to take course cis120
		TA ta120 = new TA("gamma", "cis120"); //initialize ta120 as name gamma and to the class cis120
		ta120.pickOfficeHours("Tuesday", 1); //assign ta120 to office hours on tuesday at 1 
		ta120.pickRecitationTime(3); //assign ta120 to recitation at 3
		student1.assignRecitationTA(ta120); //assign student 1 to the ta120 recitation 
		ta120.gradeStudent(student1, "B+"); //ta120 assigns the student1 a grade of B+
		student1.printReport(); //student1 print the report 
		ta110.pickOfficeHours("Tuesday", 4); //change office hour time
		ta110.displayOfficeHours(); //displayt the office hours for ta110
		//System.out.println(student1.isElgibleForDeanList()) and state whether or not the student is elgible for deans list 
		if (student1.isElgibleForDeanList() == true){
			System.out.println("The student is elgible for dean's list");
		}	
		else{
			System.out.println("The student is NOT elgible for dean's list");
		}
		

	}
}
