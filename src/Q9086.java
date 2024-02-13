import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] result = new String[T];
        for (int i=0 ; i<T ; i++){
            String word = br.readLine();
            String[] spell = word.split("");
            result[i] = spell[0] + "" + spell[word.length()-1];
        }

        for (int i=0 ; i<T ; i++){
            System.out.println(result[i]);
        }
    }
}
