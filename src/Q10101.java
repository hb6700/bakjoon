import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int angle1 = Integer.parseInt(br.readLine());
        int angle2 = Integer.parseInt(br.readLine());
        int angle3 = Integer.parseInt(br.readLine());

        if (angle1 + angle2 + angle3 == 180){
            if (angle1 == angle2 && angle2 == angle3){
                System.out.print("Equilateral");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.print("Isosceles");
            } else {
                System.out.print("Scalene");
            }
        } else {
            System.out.print("Error");
        }
    }
}
