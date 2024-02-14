import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int row = 1, col = 1;

        for (int i=0 ; i<9 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0 ; j<9 ; j++){
                int N = Integer.parseInt(st.nextToken());
                if (N > max){
                    max = N;
                    row = i + 1; // 행 번호 계산 시에 1을 더함
                    col = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
