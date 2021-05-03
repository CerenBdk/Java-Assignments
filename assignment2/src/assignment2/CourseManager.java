package assignment2;

public class CourseManager {

	public void add(Course course)
	{
		System.out.println( course.getName() + " has been added.");
	}
	
	public void add(Course[] courses)
	{
		for(Course course:courses) {
			add(course);
		}
	}
	
	public void update(Course course)
	{
		System.out.println( course.getName() + " has been updated.");
	}
	
	public void delete(Course course)
	{
		System.out.println( course.getName() + " has been deleted.");
	}
	
}
