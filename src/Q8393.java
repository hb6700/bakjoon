import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = 0;

        for (int i=0 ; i<n ; i++){
            result = result + (i+1);
        }

        System.out.println(result);
    }
}
