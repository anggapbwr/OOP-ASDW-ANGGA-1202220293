public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private static int rows = 5;
    
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private static int seat_per_row = 10;
    
    // TO DO: Create 2 dimensional array to store seat reservation status
    public static int[][] seats = new int[rows][seat_per_row];
    
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        seats[0][2] = 1;
        seats[1][5] = 1;
        seats[3][7] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Booking Tiket Bioskop : ");
        for (int b = 0; b < rows; b++) {
            for (int k = 0; k < seat_per_row; k++) {
                System.out.print(seats[b][k] + " ");
            }
            System.out.println(); 
        }
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (seats[row][seat] == 0) {
            seats[row][seat] = 1;
            System.out.println("Kursi berhasil dipesan pada baris " + (row + 1) + ", kursi " + (seat + 1));
        } 
        else  {
            System.out.println("Kursi sudah dipesan.");
        }
    }
}