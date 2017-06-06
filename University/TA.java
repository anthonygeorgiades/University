package University;
import java.util.*; //import util
public class TA {

	//Define instance variables below for TA (TA name as string, course name they TA as string, office hour day as string, office hour time as double, recitation time as double
	String name; //Define instance variables variables private, methods publics
	String courseName; 
	String officeHourDay;
	double officeHourTime;
	double recitationTime;
	
	//Constructor
	public TA (String name, String courseName){ 

		this.name = name;
		this.courseName = courseName;	
		this.officeHourDay = "uknown";
		this.officeHourTime = 0;
		this.recitationTime = 0;
	
	}
	
	/**
	 * 
	 * @param day, have the TA pick their office hours by first selecting day 
	 * @param start, have the TA pick their office hours by then selecting office hour time on the specified day
	 */
	public void pickOfficeHours(String day, double start){
		this.officeHourDay = day;
		this.officeHourTime= start;
	}
	
	/**
	 * 
	 * @param start have the TA set their recitation start time as a double
	 */
	public void pickRecitationTime(double start){
		this.recitationTime = start;
	}
	
	/**
	 * 
	 * @return the name of the TA
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 
	 * @return the name of the course that the TA inputs as TA'ing
	 */
	public String getcourse(){
		return courseName;
	}
	
	/**
	 * 
	 * @return the recitation Time of the TA
	 */
	public double getrecitationTime(){
		return recitationTime;
	}

	/**
	 * print the office hours of the TA, printing the day and time, where time is the office hour start + an additional 2 hours
	 */
	public void displayOfficeHours(){
		System.out.println("office hours " + officeHourDay + " from " + officeHourTime + " to " + (officeHourTime +2));
	}
	
	/** 
	 * @param give the student a grade by entering a 
	 * @param grade
	 */
	public void gradeStudent(Student student, String grade){
		student.receiveGrade(this.courseName, grade);
	}

}
