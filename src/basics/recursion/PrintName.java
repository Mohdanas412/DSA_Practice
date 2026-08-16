import java.util.Scanner;
public class PrintName {
    static void printname(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.println("Anas");
        printname(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printname(n);
    }
}