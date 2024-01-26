import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int price = 0;
        if (A == B && B == C){
            price = 10000 + (A * 1000);
        } else if (A != B && B != C && A != C) {
            if(A > B){
                if(C > A){
                    price = C * 100;
                }else {
                    price = A * 100;
                }
            }else {
                if(C > B){
                    price = C * 100;
                }else {
                    price = B * 100;
                }
            }
        } else {
            if (A == B || A == C){
                price = 1000 + (A * 100);
            }else {
                price = 1000 + (B * 100);
            }
        }
        System.out.println(price);

    }
}
