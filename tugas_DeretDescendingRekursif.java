import java.util.Scanner;

public class tugas_DeretDescendingRekursif {
    static void tampilkanRekursif(int n) {
        if (n < 0) { 
            return;
        } else {
            System.out.print(n + " ");  
            tampilkanRekursif(n - 1);
        }
    }
    static void tampilkanIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Masukkan bilangan n: ");
        n = sc.nextInt();
        System.out.println("Bilangan dari " + n + " sampai 0 menggunakan rekursif:");
        tampilkanRekursif(n);
        System.out.println();
        System.out.println("Bilangan dari " + n + " sampai 0 menggunakan iteratif:");
        tampilkanIteratif(n);
    }
}