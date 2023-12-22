import java.util.ArrayList;

public class Student extends User{
    protected ArrayList<String> enrolledCourse;

    public Student(String name, int id){
        super(name, id);
        enrolledCourse = new ArrayList<>();
    }
    public void enrolledCourse(String course) {
        enrolledCourse.add(course);
    }

    public String getUserDetails() {
        return "\nStudent -" + super.getUserDetails() + "\nEnrolled Course: " + enrolledCourse ;
    }
}