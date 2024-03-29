import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = 0;
        for (int i=0 ; i<N ; i++){
            int num =  Integer.parseInt(st.nextToken());

            if (num == 2){
                cnt++;
            }

            decimal:if (num > 2){
                for (int j=2 ; j<num ; j++){
                    if (num % j == 0){
                        break decimal;
                    }
                }
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}
