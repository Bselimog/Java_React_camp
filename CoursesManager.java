package CoursesOperations;

public class CoursesManager {
	public void ListCourseDetail(Courses course) {
		System.out.println("Kurs Adý..:" + course.name);
		System.out.println("Eðitmen Adý..:" + course.instructorName);
		System.out.println("Tamamlanma Oraný..: %" + course.completedRate);
	}
	
	public void CompleteTheCourse(Courses course, int completedLessonCount) {
		course.completedRate += completedLessonCount/course.lessonCount;
	}
	
}
