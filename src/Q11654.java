import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char alphabet = br.readLine().charAt(0);
        int result = (int)alphabet;
        System.out.print(result);
    }
}
