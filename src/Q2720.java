import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] result = new String[T];

        for (int i=0 ; i<T ; i++){
            int C = Integer.parseInt(br.readLine());

            int quarter = C / 25;
            C %= 25;

            int dime = C / 10;
            C %= 10;

            int nickel = C / 5;
            C %= 5;

            int penny = C;

            result[i] = quarter + " " + dime + " " + nickel + " " + penny;
        }

        for (int i=0 ; i<T ; i++){
            System.out.println(result[i]);
        }
    }
}
