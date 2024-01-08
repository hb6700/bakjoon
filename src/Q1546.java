import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double score[] = new double[N];
        double avg = 0, max = 0, sum = 0;

        for(int i=0 ; i<score.length ; i++){
            score[i] = scan.nextInt();
            if(score[i] > max){
                max = score[i];
            }
        }

        for(int i=0 ; i<score.length ; i++){
            score[i] = (score[i]/max)*100;
            sum += score[i];
        }

        avg = sum/N;
        System.out.println(avg);
    }
}
