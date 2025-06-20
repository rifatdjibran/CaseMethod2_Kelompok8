public class TransaksiPengisian10 {
    Kendaraan10 kendaraan;
    BBM10 bbm;
    double liter, totalBayar;

    public TransaksiPengisian10(Kendaraan10 kendaraan, BBM10 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void tampilkanTransaksi() {
        System.out.println(" ");
        System.out.println("Plat: " + kendaraan.platNomor + ", Total Bayar: Rp " + totalBayar);
    }
}
