//백준 2884
import java.util.Scanner;

public class Q011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력 : ");
        String input = scan.nextLine();

        String[] split = input.split(" ");
        int h = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

//        System.out.println(split[0]);
//        System.out.println(h+m);

        if (m - 45 < 0) {
            if (h == 0) {
                h = h + 23;
                m = m + 60;
            }else {
                h = h - 1;
                m = m + 60;
            }
        }
        m = m - 45;
        System.out.printf("%d %d", h, m);
    }
}
