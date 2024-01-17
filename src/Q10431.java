import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[N];

        for(int i=0 ; i<N ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());
            int[] num = new int[20];

            for(int j=0 ; j<20 ; j++){
                num[j] = Integer.parseInt(st.nextToken());
            }

            for(int j=0 ; j<20 ; j++){
                for(int k=0 ; k<j ; k++){
                    if(num[k] > num[j]){
                        cnt[i]++;
                    }
                }
            }
        }

        for (int i=0 ; i<N ; i++){
            System.out.println((i+1) + " " + cnt[i]);
        }
    }
}
