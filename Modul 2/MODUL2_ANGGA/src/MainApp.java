public class MainApp {
    public static void main(String[] args){
        // TO DO: Create expedisi Object from Ekspedisi Class
        Ekspedisi ekspedisi = new Ekspedisi(10, "Jakarta", 10000);
        ekspedisi.informasi();
        // TO DO: Create teluexpress Object from TelUExpress Class
        TelUExpress teluexpress = new TelUExpress(100, "Bandung", 50000, true);
        teluexpress.informasi();
        teluexpress.ambil("Sukabirus");
        teluexpress.antar(1628389);
        teluexpress.antar(1922722,7628262);
        // TO DO: Create friexpress Object from FRIExpress Class
        FRIExpress friexpress = new FRIExpress(30, "Bojongsoang", 70000, false);
        friexpress.informasi();
        friexpress.terima(2000);
        friexpress.kirim("Lembang");
        friexpress.kirim("Braga", "Rancaekek");
        }
}
        
        
        

        

        

