public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String Name ;
    private int PhoneNumber ;
    
    public User (String Name, int PhoneNumber){
        this.Name = Name ;
        this.PhoneNumber = PhoneNumber ;
    }



    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void RegisterUser (){
 
        System.out.println("================================");
        System.out.println("Register Berhasil");
        System.out.println("Nama : " + Name);
        System.out.println("No Handphone : " + PhoneNumber);
        System.out.println("================================");

    }
}
