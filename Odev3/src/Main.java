
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] takenCourse = {"Java Kurs"};
		String[] takenCourseInstructor = {"Java Kurs","C#Kurs"};
		String[] instructorstudent = {"bselimog"};
		Student student= new Student (1,"bselimog","bselimog@gmail.com","1234",takenCourse,"Engin Demirog","Çok güzel");
		Instructor instructor= new Instructor(1, "htenk", "htenk@gmail.com", "125", takenCourseInstructor, instructorstudent);
		
		StudentManager studentManager = new StudentManager();
		takenCourse = studentManager.CourseList(student);
		  System.out.println("---------------------------------------");
        studentManager.StudentCourseTake(student, takenCourse);
        System.out.println("---------------------------------------");
        studentManager.Password(student,"1234", "67");
        InstructorManager instructorManager = new InstructorManager();
        System.out.println("---------------------------------------");
        takenCourseInstructor =instructorManager.InstructorCourseList(instructor);
        System.out.println("---------------------------------------");
        instructorManager.addCourse(instructor, takenCourseInstructor);
        System.out.println("---------------------------------------");
        studentManager.Password(student,"1234", "67");
        
        
        
		
		
		

	}

}
