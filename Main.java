package javaCourseWork;


public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.id=1;
		course1.name="Java";
		course1.teacher="Engin DEMİROĞ";
		course1.explanation="Java ile birlikte React eğitimi";
		
		Course course2 = new Course(1,"C#","Sadık TURAN","C# ile Angular");
		
		Course[] courses = {course1, course2};
		
		CourseManager courseManager=new CourseManager();
		
		for (Course course : courses) {
			courseManager.addCourse(course);
		}
		
	}

}
