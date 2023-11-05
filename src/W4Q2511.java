import java.util.Scanner;

//백준 2511번(4주차)
public class W4Q2511 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //배열 초기화
        int[] a = new int[10];
        int[] b = new int[10];

        for(int i=0 ; i<10 ; i++){
            a[i] = scan.nextInt();
        }
        for(int i=0 ; i<10 ; i++){
            b[i] = scan.nextInt();
        }

        int aScore = 0, bScore = 0;
        String result = null;

        for(int i=0 ; i<10 ; i++){
            if(a[i] == b[i]){
                aScore += 1;
                bScore += 1;
                //result = "D";
            }else if(a[i] > b[i]){
                aScore += 3;
                result = "A";
            }else{
                bScore += 3;
                result = "B";
            }
        }

        //A가 이기면 A, B가 이기면 B, 둘이 비기면 D 출력
        if(aScore > bScore){
            result = "A";
        }else if(aScore < bScore){
            result = "B";
        }else{
            if(result == "A"){
                result = "A";
            }else if(result == "B"){
                result = "B";
            }else{
                result = "D";
            }
        }
        System.out.printf("%d %d\n", aScore, bScore);
        System.out.print(result);
    }
}
