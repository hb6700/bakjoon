//백준 10869
import java.util.Scanner;

public class Q003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.printf("a + b = %d\n", a+b);
        System.out.printf("a - b = %d\n", a-b);
        System.out.printf("a * b = %d\n", a*b);
        System.out.printf("a / b = %d\n", a/b);
        System.out.printf("a %% b = %d\n", a%b);
    }
}
