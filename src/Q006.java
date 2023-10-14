//백준 2588
import java.util.Scanner;

public class Q006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 수 : ");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.print("두번째 수 : ");
        String b = scan.nextLine();

//        각 자리 잘라내기
//        System.out.println(b.charAt(0));              //3(문자)
//        System.out.println(b.charAt(0)-48);           //3(숫자)
        System.out.println((b.charAt(2)-48) * a);       //472 X 5 = 2360
        System.out.println((b.charAt(1)-48) * a);       //472 X 8 = 3776
        System.out.println((b.charAt(0)-48) * a);       //472 X 3 = 1426
        System.out.println(a * Integer.parseInt(b));    //181720

    }
}
