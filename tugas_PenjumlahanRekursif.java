import java.util.Scanner;

public class tugas_PenjumlahanRekursif {
    static int hitungPenjumlahan(int n, StringBuilder deret) {
        if (n == 1) { 
            deret.append("1");
            return 1;
        } else {
            int hasil = n + hitungPenjumlahan(n - 1, deret);
            deret.insert(0, n + " + ");
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil;
        System.out.print("Masukkan bilangan yang ingin dijumlah: ");
        bil = sc.nextInt();
        StringBuilder deret = new StringBuilder();
        int hasilPenjumlahan = hitungPenjumlahan(bil, deret);
        System.out.println("Deret penjumlahan: " + deret.toString() + " = " + hasilPenjumlahan);
    }
}