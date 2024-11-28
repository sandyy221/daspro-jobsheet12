import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class Rekursif_Percobaan3 {
    static double hitungLaba (double saldo, int tahun) {
        if (tahun == 0) {
            return saldo;
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextInt();
        System.out.print("Lamanya investasi (tahun): ");
        tahun = sc.nextInt();
        System.out.println("jumlah saldo setelah " + tahun + " tahun: " );
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}
