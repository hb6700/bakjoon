import java.util.Scanner;

//백준 2839
public class Q2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kilo = scan.nextInt();

        if (kilo - 5 < 0) {
            System.out.println(-1);
        } else {
            System.out.println(kilo/5+1);
        }
    }
}
