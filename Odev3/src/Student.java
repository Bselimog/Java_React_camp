
public class Student extends User {
	
	private String[] course;
	private String instructor;
	private String comments;
	
	public Student(int id,String userName,String eMail,String password,String[] takenCourse,String instructor,String comments)
	{
	this.setId(id);
	this.setUserName(userName);
	this.seteMail(eMail);
	this.setPassword(password);
	this.setCourse(takenCourse);
	this.setInstructor(instructor);
	this.setComments(comments);
		
		
		
		
		
	}
	
	

	
	
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	
	
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}





	public String[] getCourse() {
		return course;
	}





 public void setCourse(String[] course) {
		this.course = course;
	}
	

}
