package CoursesOperations;

public class CoursesManager {
	public void ListCourseDetail(Courses course) {
		System.out.println("Kurs Ad�..:" + course.name);
		System.out.println("E�itmen Ad�..:" + course.instructorName);
		System.out.println("Tamamlanma Oran�..: %" + course.completedRate);
	}
	
	public void CompleteTheCourse(Courses course, int completedLessonCount) {
		course.completedRate += completedLessonCount/course.lessonCount;
	}
	
}
