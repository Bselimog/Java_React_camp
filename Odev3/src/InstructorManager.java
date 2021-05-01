
public class InstructorManager extends UserManager {
	
	public void addCourse(Instructor instructor,String[] newcourse) {
		instructor.setCoursesGiven(newcourse);
		System.out.println("Yeni Kurs eklendi");
		for (String course : newcourse) {
			System.out.println(course);
		}
		 
		
	}
	public String [] InstructorCourseList(Instructor instructor)
	 { 
		 String[] courseList = instructor.getCoursesGiven();
		 return courseList;
		 
	 }
}
