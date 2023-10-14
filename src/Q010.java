//백준 14681
import java.util.Scanner;

public class Q010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("axis X : ");
        int x = scan.nextInt();
        System.out.print("axis Y : ");
        int y = scan.nextInt();

        if(x>0){
            if(y>0){
                System.out.println("1");
            } else if (y<0) {
                System.out.println("4");
            }
        } else if (x<0) {
            if(y>0) {
                System.out.println("2");
            } else if(y<0) {
                System.out.println("3");
            }
        }
    }
}
