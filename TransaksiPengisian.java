public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    public void tampilkanTransaksi() {
        System.out.println(" ");
        System.out.println(kendaraan.platNomor + ": Rp " + totalBayar);
    }
}
