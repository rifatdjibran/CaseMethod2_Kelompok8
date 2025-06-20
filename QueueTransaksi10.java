public class QueueTransaksi10 {
    TransaksiPengisian10[] transaksi;
    int front, rear, size, max;

    public QueueTransaksi10(int max) {
        this.max = max;
        transaksi = new TransaksiPengisian10[max];
        front = rear = size = 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(TransaksiPengisian10 t) {
        if (isFull()) {
            System.out.println(">> Queue transaksi penuh.");
            return;
        }
        transaksi[rear] = t;
        rear = (rear + 1) % max;
        size++;
        System.out.println(">> Transaksi berhasil dicatat.");
    }

    public int hitungTotalPendapatan() {
        int total = 0;
        int i = front;
        int count = 0;
        while (count < size) {
            total += transaksi[i].getTotalBayar(); 
            i = (i + 1) % max;
            count++;
        }
        return total;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println(">> Belum ada transaksi.");
            return;
        }

        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi: ");
        int i = front;
        int count = 0;
        while (count < size) {
            transaksi[i].tampilkanTransaksi();
            i = (i + 1) % max;
            count++;
        }
        System.out.println("Total Pendapatan SPBU: Rp " + hitungTotalPendapatan());
    }
}



