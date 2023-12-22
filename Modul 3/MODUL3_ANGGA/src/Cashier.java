public class Cashier extends Bioskop {
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {   
        boolean isBooked = false;
        for (int b = 0; b < super.seats.length ; b++) {
            for (int k = 0; k < super.seats[b].length; k++) {
               if(!(b==0 && k==2) | (b==1 && k==5) | (b==3 && k==7)){
                if (super.seats[b][k] == 1){
                    isBooked = true;
                    System.out.println("==============================");
                    System.out.println("Nama : "+ user.getName());
                    System.out.println("Phone : "+ user.getnoHandPhone());
                    System.out.println("Seats : " + (b + 1) + "," + (k + 1));
                    System.out.println("==============================");
                    System.out.println("Selamat Menonton!");
                }
               }
            } 
        }
        
}
}
