import java.util.Scanner;

public class PrintNumRev{
    static void printnumrev(int current) {
        if(current < 1) {
            return;
        }
        System.out.println(current);

        printnumrev(current - 1);
    }
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int N = sc.nextInt();

        printnumrev(N);

    }
}