class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
        }
        public void manageSystem() {
            System.out.println(name +"'s managing the university system\n");
        }

        public String getUserDetails() {
            return "Admin -" + super.getUserDetails();
        }
}