import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int D = B + C;
        if(D >= 60){
            A = A + (D/60);
            B = D % 60;
            if(A >= 24){
                A = A - 24;
                System.out.println(A + " " + B);
            }else {
                System.out.println(A + " " + B);
            }
        }else {
            B = B + C;
            System.out.println(A + " " + B);
        }
    }
}
