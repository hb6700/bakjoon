import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Q11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int i=0 ; i<n ; i++){
             StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> (e1[0] == e2[0] ? e1[1] - e2[1] : e1[0] - e2[0]));
        // Arrays.sort(2차원 배열, (o1,o2) -> ( 조건문 ? true 일때 정렬순서 : false일때 정렬순서));

        for (int i=0 ; i<n ; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
