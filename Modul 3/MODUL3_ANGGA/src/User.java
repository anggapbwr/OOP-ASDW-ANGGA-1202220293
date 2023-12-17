public class User {
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getUserDetails() {
        return "name: " + name + " ID :" + id;
    }
}
