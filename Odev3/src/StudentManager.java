
public class StudentManager extends UserManager {
	
	
	public void StudentCourseTake(Student student ,String[] takecourse) {
		student.setCourse(takecourse);
		System.out.println(" Kurslarım");
		
		for (String course : takecourse) {
			System.out.println(course);
		}
		
	}
	 public String [] CourseList(Student student)
	 { 
		 String[] courseList = student.getCourse();
		 return courseList;
		 
	 }
	
	
	
	
	

}
