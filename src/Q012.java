//백준 25314
import java.util.Scanner;

public class Q012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input : ");
        int b = scan.nextInt();     //byte
        int count = b / 4;

        for(int i=0; i<count ; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
