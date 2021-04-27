package CoursesOperations;

public class Courses {	
	public Courses(int id, String name, String instructorName, int lessonCount, double completedRate) {
		this.id = id;
		this.name = name;
		this.instructorName = instructorName;
		this.lessonCount = lessonCount;
		this.completedRate = completedRate;
	}
	
	int id;
	String name;
	String instructorName;
	int lessonCount;
	double completedRate;
}
