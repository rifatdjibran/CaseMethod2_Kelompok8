public class Kendaraan10 {
    String platNomor, tipe, merk, tanggalMasuk;

    public Kendaraan10(String platNomor, String tipe, String merk, String tanggalMasuk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
        this.tanggalMasuk = tanggalMasuk;
    }

    public void tampilkanInformasi() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
        System.out.println("Tanggal Masuk: " + tanggalMasuk);
    }
}
