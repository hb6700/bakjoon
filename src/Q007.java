//백준 11382
import java.util.Scanner;

public class Q007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input : ");
        String input = scan.nextLine();

        String[] math = input.split(" ");
        int a = Integer.parseInt(math[0]);
        int b = Integer.parseInt(math[1]);
        int c = Integer.parseInt(math[2]);

        System.out.printf("세 숫자의 합 : %d", a+b+c);

    }
}
