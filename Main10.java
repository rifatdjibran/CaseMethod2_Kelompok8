import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKendaraan10 antrian = new AntrianKendaraan10();
        QueueTransaksi10 transaksiQueue = new QueueTransaksi10(100);
        int pilih;

        do {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Masukkan Tanggal Masuk: ");
                    String tanggal = sc.nextLine();
                    Kendaraan10 k = new Kendaraan10(plat, tipe, merk, tanggal);
                    antrian.tambahAntrian(k);
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + antrian.jumlahAntrian());
                    break;

                case 4:
                    Kendaraan10 dilayani = antrian.layaniAntrian();
                    if (dilayani != null) {
                        System.out.print("Masukkan Jenis BBM: ");
                        String namaBBM = sc.nextLine();
                        System.out.print("Masukkan Harga per liter: ");
                        double harga = sc.nextDouble();
                        System.out.print("Masukkan Jumlah liter: ");
                        double liter = sc.nextDouble();
                        sc.nextLine();
                        BBM10 bbm = new BBM10(namaBBM, harga);
                        TransaksiPengisian10 tp = new TransaksiPengisian10(dilayani, bbm, liter);
                        transaksiQueue.enqueue(tp);
                    }
                    break;

                case 5:
                    transaksiQueue.tampilkanSemua();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);

        sc.close();
    }
}
