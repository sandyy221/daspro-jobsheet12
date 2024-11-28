import java.util.Scanner;
public class percobaan1_pertanyaanNo2 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci ke-5: " + fibonacci(5));
    }
}
