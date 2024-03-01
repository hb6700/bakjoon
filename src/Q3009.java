import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int[] corner_1 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] corner_2 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
        st = new StringTokenizer(br.readLine());
        int[] corner_3 = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int x;
        if (corner_1[0] == corner_2[0]){
            x = corner_3[0];
        } else if (corner_1[0] == corner_3[0]) {
            x = corner_2[0];
        } else {
            x = corner_1[0];
        }

        int y;
        if (corner_1[1] == corner_2[1]){
            y = corner_3[1];
        } else if (corner_1[1] == corner_3[1]) {
            y = corner_2[1];
        } else {
            y = corner_1[1];
        }

        System.out.println(x + " " + y);
    }
}