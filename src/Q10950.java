import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] arr = new int[T];

        for (int i=0 ; i<T ; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            arr[i] = A + B;
        }

        for (int i=0 ; i<T ; i++){
            System.out.println(arr[i]);
        }
    }
}
