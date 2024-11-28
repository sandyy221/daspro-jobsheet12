import java.util.Scanner;
public class Rekursif_Percobaan2 {
   
    static int hitungPangkat (int x, int y) {
        if (y ==0) {
            return 1;
        } else {
            int result = x * hitungPangkat(x, y - 1);
            if (y!=1) {
                System.out.print(x +"x" );
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;

        System.out.print("Bilangan yang di hitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        System.out.println("Deret perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}
