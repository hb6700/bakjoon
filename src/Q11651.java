import java.util.Arrays;
import java.util.Scanner;

public class Q11651 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[][] arr = new int[N][2];

        for (int i=0 ; i<N ; i++){
            arr[i][1] = scan.nextInt();
            arr[i][0] = scan.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[0] == e2[0]){
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for (int i=0 ; i<N ; i++){
            System.out.println(arr[i][1] + " " + arr[i][0]);
        }
    }
}
