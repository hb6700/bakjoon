import java.util.Scanner;

//백준 1267번(4주차)
public class W4Q1267 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //통화의 개수
        int count = scan.nextInt();

        //요금제별 요금 계산
        int y = 0, m = 0;

        for(int n = 0; n < count ; n++){
            int time = scan.nextInt();
            y += ((time/30)+1)*10;
            m += ((time/60)+1)*15;
        }

        if(y == m){
            System.out.print("Y M " + y);   //m
        }else if(y > m){
            System.out.print("M " + m);
        }else{
            System.out.print("Y " + y);
        }
    }
}
