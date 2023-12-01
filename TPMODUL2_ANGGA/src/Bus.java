class Bus extends Kendaraan {
    private int jumlahkursi;

    public Bus(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang, int jumlahkursi) {
        super(nomorIdentifikasi, kecepatanMaksimum, kapasitasPenumpang);
        this.jumlahkursi = jumlahkursi;
    }

    public String toString() {
        return super.toString() + "\nTotal Kursi: " + jumlahkursi;
    }
}