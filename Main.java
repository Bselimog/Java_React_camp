package CoursesOperations;

public class Main {

	public static void main(String[] args) {
		Courses courseCSharpCamp = new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kapmý (C# + Angular)", "Engin Demirog", 21, 0);
		Courses courseJavaCamp = new Courses(1,"Yazýlým Geliþtirici Yetiþtirme Kapmý (Java + React)", "Engin Demirog", 16, 0);
		
		Courses[] courses = {courseCSharpCamp, courseJavaCamp};
		
		CoursesManager coursesManager = new CoursesManager();
		
		for(Courses course:courses) {
			coursesManager.ListCourseDetail(course);
			System.out.println("------------------------------------------------------");
		}
	}

}
