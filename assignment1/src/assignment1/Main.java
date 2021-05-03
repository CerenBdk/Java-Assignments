package assignment1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course1 = new Course(1, "Java", "Engin Demiroğ");
		Course course2 = new Course(2, "C#", "Engin Demiroğ");
		
		Course[] courses = {course1, course2};
		
		Student student1 = new Student(1, "name surname", "test@test.com", "1234", "/folder/xyz.com");
		Student student2 = new Student(2, "name1 surname1", "test1@test1.com", "12341", "/folder1/xyz1.com");
		
		Student[] students = {student1, student2};
		
		Instructor instructor1 = new Instructor(1, "Engin Demiroğ", "(MCT) ,PMP ve ITIL");
		
		Instructor[] instructors = {instructor1};
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.updateCourse(course2);
		
	
 	}

}
