import java.time.LocalDate;

public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String NamaBand;
    private LocalDate Tanggal;
    private String Lokasi;
    private double HargaTiket;
    public String getNamaBand() {
        return NamaBand;
    }
    public void setNamaBand(String namaBand) {
        NamaBand = namaBand;
    }
    public LocalDate getTanggal() {
        return Tanggal;
    }
    public void setTanggal(LocalDate tanggal) {
        Tanggal = tanggal;
    }
    public String getLokasi() {
        return Lokasi;
    }
    public void setLokasi(String lokasi) {
        Lokasi = lokasi;
    }
    public double getHargaTiket() {
        return HargaTiket;
    }
    public void setHargaTiket(double hargaTiket) {
        HargaTiket = hargaTiket;
    }
   
}