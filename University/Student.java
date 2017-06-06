package University;
import java.util.*; //import util
public class Student {

	//Define instance variables below for student (student name as string, graduation year as int, GPA as double, int as numCoursesCompleted etc
	String name; 
	int graduationYear; 
	double GPA;
	int numCoursesCompleted;
	boolean inGoodStanding;
	TA recitationTA;

	//Constructor
	public Student (String name, int graduationYear){ //create a constructor for the student class with arguments name and graduation year 
		
		//initialize variables 
		this.name = name; 
		this.graduationYear = graduationYear;	
		this.GPA = 0;
		this.numCoursesCompleted = 0;
		this.inGoodStanding = true;
		this.recitationTA = null;
	}

	/**
	 * 
	 * @return the student's name 
	 */
	public String getName(){  
		return name;

	}

	/**
	 * 
	 * @return the student's graduation year
	 */
	public int getgraduationYear(){
		return graduationYear;
	}
	
	/**
	 * 
	 * @param year- the year you want to set graduation year to 
	 */
	public void setgraduationYear(int year){ //Use void when we are not returning anything
		this.graduationYear = year;
	}
	
	/**
	 *  
	 * @return the student's GPA
	 */
	public double getGPA(){
		return GPA;
	}

	/**
	 * 
	 * @return true for student as being eligible for dean list under the conditions that student's if gpa is over 3.7 and they are in good standing. if either are not true, return false
	 */
	public boolean isElgibleForDeanList(){
		if (GPA>3.7 && inGoodStanding==true){
			return true;
		}
		else{
			return false;
			}
	}
	
	/**
	 * 
	 * @param courseName take the course name that a student enters and then print that the student, by calling name, "is now enrolled in" whatever argument for string course name was inputted
	 */
	public void takeCourse(String courseName){
		System.out.println(name + " is now enrolled in " + courseName);		
	}
	
	/**
	 * 
	 * @param first, take in whatever course name the student enters, reflecting the course that the student wants to applied the grade to
	 * @param grade- take in whatever grade the user enters and apply it to the course that the student inputted in the first argument
	 * this method will then apply a numeric value to the grade. at the end, it will weight every numeric value entered for the different grades to establish a GPA
	 */
	public void receiveGrade(String courseName, String grade){
		System.out.println(name + " got " + grade + " in " + courseName);
		double numericValue = 0; //initalize this variable to 0 as we use numeric value in this method and have not previously initialized it
		if (grade == "A"){
			numericValue=4;
		}
		else{
			if (grade == "A-"){
				numericValue=3.7;
			}
			else{
				if (grade == "B+"){
					numericValue=3.3;
				}
				else{
					if (grade == "B"){
						numericValue=3;
					}
					else{
						if (grade == "B-"){
							numericValue=2.7;
						}
						else{
							if (grade == "C+"){
								numericValue=2.3;
							}
							else{
								if (grade == "C"){
									numericValue=2;
								}	
								else{
									if (grade == "C-"){
										numericValue=1.3;
									}
									else{
										if (grade=="D+"){
											numericValue=1.0;
										}
										}
									}
								}
							}
						}
					}
				}
			}
    		this.GPA = (GPA * numCoursesCompleted + numericValue) / (numCoursesCompleted + 1);
    		this.numCoursesCompleted += 1;
		}

	/**
	 * we will define a student being caught cheating as one who's good standing is defined as false, therefore they are not in good standing
	 * use void since we are not returning anything but rather defining 
	 */
	public void caughtCheating(){
		inGoodStanding = false;
	}
	
	/**
	 * this method will print print out the name of the student followed by UPENN and their graduation year, it will also print their GPA and then print how many courses they have completed. If they have only completed one course, it will just print course
	 */
	public void printReport(){
		System.out.println("This is " + name + ", UPENN " + graduationYear);
		System.out.println("Their GPA is " + GPA);
		String numCoursesString = "";
		if (numCoursesCompleted == 1){
			numCoursesString="course";	//if the student has only taken one course, just print course
		}
		else{
			numCoursesString="courses"; //if the student has taken more than one course, print courses when called
		}
		System.out.println("They have taken " + numCoursesCompleted + " " + numCoursesString); 
	}
	
	/**
	 * 
	 * @param ta, assign the student a TA for their recitation then print the ta's name and their recitation time from the TA.java file and method getName and getrecitationTime
	 */
	public void assignRecitationTA(TA ta){
		this.recitationTA = ta;
		System.out.println(name + " your TA is " + ta.getName() + " whose recitation is at " + ta.getrecitationTime());
	}
	
	}