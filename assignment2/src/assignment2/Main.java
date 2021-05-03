package assignment2;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();	
		Student student = new Student();
		student.setFirstName("Harry");
		student.setLastName("Potter");
		userManager.add(student);
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Remus");
		instructor.setLastName("Lupin");
		userManager.update(instructor);
		
		Course transfiguration = new Course(1, "Transfiguration");
		Course defence = new Course(2, "Defence Against the Dark Arts");
		Course potions = new Course(3, "Potions");
		Course magic = new Course(4, "History of Magic");
		
		Course[] courses = {transfiguration, defence, potions, magic};
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(courses);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.openCourse(defence);
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student, defence);
		
	}

}
