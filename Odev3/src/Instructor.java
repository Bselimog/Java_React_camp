
public class Instructor extends User {

	private String[] coursesGiven;
	private String[] student;
	
	
	public Instructor(int id,String userName,String eMail,String password,String[] takenCourseGiven,String[] student)
	{
	this.setId(id);
	this.setUserName(userName);
	this.seteMail(eMail);
	this.setPassword(password);
	this.setCoursesGiven(takenCourseGiven);
	this.setStudent(student);
		
		
		
		
	}
	
	
	

	public String[] getCoursesGiven() {
		return coursesGiven;
	}


	public void setCoursesGiven(String[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}




	public String[] getStudent() {
		return student;
	}




	public void setStudent(String[] student) {
		this.student = student;
	}
	

}
