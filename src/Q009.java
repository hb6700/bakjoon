//백준 2753
import java.util.Scanner;

public class Q009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("연도 입력 : ");
        int year = scan.nextInt();

        if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
