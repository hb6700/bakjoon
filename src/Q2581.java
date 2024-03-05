import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int result = 0, min = N;
        for (int i=M ; i<=N ; i++){
            if (min > i){
                min = i;
            }

            if (i == 2){
                result += i;
                min = i;
            }
            demical:if (i>2){
                for(int j=2 ; j<i ; j++){
                    if (i%j == 0){
                        break demical;
                    }
                }
                result += i;
                if (min > i){
                    min = i;
                }
            }
        }
        System.out.println(result);
        System.out.println(min);
    }
}
