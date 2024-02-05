import java.util.Scanner;

public class Q5585 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //물건 가격
        int money = scan.nextInt();

        //돌려받을 돈
        money = 1000 - money;

        //거스름돈 리스트
        int[] change = {500, 100, 50, 10, 5, 1};

        //동전 개수
        int count = 0;

        for(int i=0; i <6 ; i++){
            //돌려받을 돈이 있을때
            if(money/change[i] > 0){
                count += money/change[i];
                money = money%change[i];
            }
        }
        System.out.println(count);
    }
}
