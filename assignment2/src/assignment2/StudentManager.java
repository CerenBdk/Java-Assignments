package assignment2;

public class StudentManager extends UserManager{

	public void joinCourse(Student student, Course course) {
		System.out.println(course.getName() + " has been selected by " + student.getFirstName() + " " + student.getLastName() + ".");
	}
	
	public void removeCourse(Course course) {
		System.out.println(course.getName() + " has been removed");
	}
}
