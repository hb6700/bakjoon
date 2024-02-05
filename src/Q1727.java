import java.util.Scanner;

public class Q1727 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();         //남자 수
        int m = scan.nextInt();         //여자 수
        int[] male = new int[n];        //남자 성격 점수
        int[] female = new int[n];      //여자 성격 점수
        int diff = 0;                   //성격의 차이
        int result = 1000000;           //제일 작은 성격차이

        for (int i=0 ; i<n ; i++){
            male[i] = scan.nextInt();
        }

        for (int i=0 ; i<m ; i++){
            female[i] = scan.nextInt();
        }

        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<m ; j++){
                diff = Math.abs(male[i] - female[j]);
                if(diff < result){
                    result = diff;
                }
            }
        }

        System.out.println(result);
    }
}
