import java.util.Scanner;
public class Rekursif_Percobaan1 {

    static int faktorialRekursif(int n) {
        if (n==0) {
            return(1);
        } else {
            return (n*faktorialRekursif(n - 1));
        }
    }
    static int faktorialLiteratif (int n) {
        int faktor = 1;
        for (int i =n;  i>=1; i--) {
            faktor = faktor * 1;
        }
        return faktor;
    }
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialLiteratif(5));
    }
}