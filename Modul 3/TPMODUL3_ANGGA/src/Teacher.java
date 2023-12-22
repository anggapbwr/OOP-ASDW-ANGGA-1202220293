public class Teacher extends User {
    public Teacher(String name, int id) {
        super(name, id);
    }

    public void teachClass(String course) {
        System.out.println("\n" + name + "is teaching" + course);
    }

    public String getUserDetails() {
        return "Teacher - " + super.getUserDetails();
    }
}
    

