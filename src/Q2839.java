import java.util.Scanner;

//백준 2839
public class Q2839 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kilo = scan.nextInt();
        int cnt = 0;

        while (true){
            if(kilo % 5 == 0){      //5로 나누어 떨어질 때
                System.out.println(kilo/5 + cnt);
                break;
            } else if (kilo < 0) {  //입력값이 0보다 작을 경우
                System.out.println(-1);
                break;
            }
            kilo = kilo-3;
            cnt++;
        }
    }
}
