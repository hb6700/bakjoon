import java.util.Scanner;

public class Q2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();     //카드개수
        int M = scan.nextInt();     //세 숫자 합의 최대범위
        int sum = 0;                //세 숫자의 합
        int tmp = 0;                //기존 sum값
        int[] arr = new int[N];

        for (int i=0 ; i<N ; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0 ; i<N ; i++){
            for (int j=i+1 ; j<N ; j++){
                for (int k=j+1 ; k<N ; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(tmp < sum && sum <= M){
                        tmp = sum;
                    }
                }
            }
        }
        System.out.println(tmp);
    }
}
