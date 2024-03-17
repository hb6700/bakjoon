import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        Integer[] arr = new Integer[N.length()];

        for (int i=0 ; i<N.length() ; i++){
            arr[i] = Character.getNumericValue(N.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i=0 ; i<N.length() ; i++){
            System.out.print(arr[i]);
        }
    }
}
