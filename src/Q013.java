//백준 10952
import java.util.Scanner;

public class Q013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("input : ");
            String input = scan.nextLine();
            String[] num = input.split(" ");
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);

            if((a == 0)&&(b == 0)){
//                System.out.println("quit");
                break;
            }
            System.out.printf("sum : %d\n", a+b);
        }
    }
}
