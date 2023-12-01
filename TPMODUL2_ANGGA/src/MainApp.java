public class MainApp {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Mobil77", 222, 2, 2);
        Bus bus = new Bus("Bus77", 150, 18, 2);

        System.out.println("Informasi mobil :\n" + mobil);
        System.out.println("\nWaktu tempuh :" + mobil.hitunganwaktuTempuh(1115) + "jam");

        System.out.println("Informasi bus :\n" + bus);
        System.out.println("\nWaktu Tempuh : " + bus.hitunganwaktuTempuh(2221) + "jam");
    }
}
