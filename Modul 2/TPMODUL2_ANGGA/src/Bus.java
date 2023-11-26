class Bus extends Kendaraan {
    private int jumlahkursi;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahKursi) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahkursi = jumlahKursi ; 

    }

    public String toString() {
        return super.toString() + "\nTotal Kursi: " + jumlahkursi;
    }
}