public class QueueTransaksi {
    TransaksiPengisian[] transaksi;
    int front, rear, size, max;

    public QueueTransaksi(int max) {
        this.max = max;
        transaksi = new TransaksiPengisian[max];
        front = rear = size = 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(TransaksiPengisian t) {
        if (isFull()) {
            System.out.println(">> Queue transaksi penuh.");
            return;
        }
        transaksi[rear] = t;
        rear = (rear + 1) % max;
        size++;
        System.out.println(">> Transaksi berhasil dicatat.");
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
    }
}
