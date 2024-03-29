import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int width = w - x;
        int height = h - y;

        if(x <= width){
            width = x;
        }
        if(y <= height){
            height = y;
        }

        if(width <= height){
            System.out.print(width);
        } else {
            System.out.print(height);
        }

        br.close();
    }
}
