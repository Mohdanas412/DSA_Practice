import java.util.Scanner;

public class PrintNum{
    static void printnum(int current,int N) {
        if(current > N) {
            return;
        }
        System.out.println(current);

        printnum(current + 1, N);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();

        printnum(1,N);

    }
}