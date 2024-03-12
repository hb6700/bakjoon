import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input1 = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i=0 ; i<N ; i++){
            A[i] = Integer.parseInt(input1[i]);
        }

        int M = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        int[] B = new int[M];
        for (int i=0 ; i<M ; i++){
            B[i] = Integer.parseInt(input2[i]);
        }

        int[] result = new int[M];

        for (int i=0 ; i<M ; i++){
            for (int j=0 ; j<N ; j++){
                if (B[i] == A[j]){
                    result[i] = 1;
                    break;
                }
            }
            System.out.println(result[i]);
        }
    }
}
