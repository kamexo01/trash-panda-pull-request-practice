public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.print(a + " " + b); // First two numbers

        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;  // Missing update
            System.out.print(" " + a); // Incorrect number printed
        }
    }
}