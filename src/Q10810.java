import java.util.Scanner;

public class Q10810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();     //바구니개수
        int m = scan.nextInt();     //공 넣는 횟수
        int[] arr = new int[n];

        for(int i=0 ; i<m ; i++) {
            int I = scan.nextInt();
            int J = scan.nextInt();
            int K = scan.nextInt();

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }

        for(int k=0; k<arr.length ; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
