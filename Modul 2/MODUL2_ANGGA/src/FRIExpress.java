public class FRIExpress extends Ekspedisi {
    protected boolean pecahBelah;

    public FRIExpress(int jumlahCabang, String pusat, float tarif, boolean pecahBelah) {
        super(jumlahCabang, pusat, tarif);
        this.pecahBelah = pecahBelah;
    }
    
    public void informasi(){
        System.out.println("Ekspedisi FRIExpress dengan jumlah cabang "+jumlahCabang+" dan berpusat di "+
        pusat+ " mempunyai tarif sebesar "+tarif+" per kilogram.");
        if (pecahBelah){
            System.out.println("Selain itu, ekspedisi ini melayani paket pecah belah");
        }
        else{
            System.out.println("Selain itu, ekspedisi ini tidak melayani paket pecah belah");
        }
    }

    public void terima(int jumlahPaket){
        System.out.println("FRIExpress baru saja menerima paket yang masuk untuk disortir sebanyak "+jumlahPaket+" paket");
    }

    public void kirim(String tujuan){
        System.out.println("FRIExpress berhasil mengirimkan paket ke tujuan "+tujuan);
    }

    public void kirim(String tujuan_1, String tujuan_2){
        System.out.println("FRIExpress berhasil mengirimkan paket ke tujuan "+tujuan_1+" dan "+tujuan_2);
    }
}
