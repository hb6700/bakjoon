import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        int[] line = {a,b,c};
        Arrays.sort(line);

        if (line[0] + line[1] > line[2]){
            System.out.println(a+b+c);
        }else {
            System.out.println((line[0]+line[1]) * 2 - 1);
        }
    }
}
