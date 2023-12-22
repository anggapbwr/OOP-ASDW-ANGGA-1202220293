import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner input = new Scanner(System.in);

        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop();
        Cashier cashier = new Cashier();
        User user = new User();
        
        // TO DO : Take the name from the user, make sure it is not empty
        System.out.println("Masukan nami sampean : ");
        String Name = input.nextLine();
        user.setName(Name);

        // TO DO : Take the phone number from the user, make sure it is valid
        System.out.println("Masukan Nomore sampean : ");
        String Nomor = input.nextLine();
        user.setNoHandPhone(Nomor);
        user.register();
        System.out.println("Selamat datang neng Bioskop !");
        bioskop.displaySeating();
       
        // TO DO : Create a code for ticket order
         while (true) {
            System.out.println("Apakah anda ingin memesan kursi? (y/n)");
            String pilih = input.nextLine();

            if (!pilih.equals("y")) {
                System.out.println("Mencetak tiket......");
                cashier.printTicket(user);
                break;
            }
            try{
                System.out.println("Pilih baris kursi");
                int baris = input.nextInt();
                System.out.println("Pilih posisi kursi");
                int posisi = input.nextInt();
                bioskop.bookSeat(baris, posisi);
                System.out.println("Kursi berhasil dipesan!!!");
                bioskop.displaySeating();
            
            }
            catch(Exception e){
                System.out.println("ERROR SAM ! WADUCH");
            }
        }
       
        
        // TO DO : Create a exception if user enter not number

        // TO DO : Create a exception if user enter number is out of range

        // TO DO : Call the method to reserve seats in the cinema

        // TO DO : Close the Scanner object when the user is finished   
    }
}