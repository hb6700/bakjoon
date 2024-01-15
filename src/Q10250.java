import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();         //방 개수
        int[] num = new int[T];

        for(int i=0 ; i<T ; i++){
            int H = scan.nextInt();     //층 수
            int W = scan.nextInt();     //각 층의 호 수
            int N = scan.nextInt();     //손님 순서

            if(N % H == 0){
                num[i] = ((H * 100) + (N / H));
            }else{
                num[i] = (((N % H) * 100) + (N / H) + 1);
            }
        }
        for(int i=0 ; i<T ; i++){
            System.out.println(num[i]);
        }
    }
}