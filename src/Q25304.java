import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();
        int total = 0;

        for (int i=0 ; i<N ; i++){
            int price = scan.nextInt();
            int count = scan.nextInt();
            total = total + (price * count);
        }

        if (total == X){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
