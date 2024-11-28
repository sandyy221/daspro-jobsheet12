public class tugas_Fibonacci {
    public static int jumlahPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return jumlahPasanganMarmut(bulan - 1) + jumlahPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12;
        int jumlahPasangan = jumlahPasanganMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahPasangan);
    }
}