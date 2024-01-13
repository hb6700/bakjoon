import java.util.Scanner;

public class Q2292{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int count = 1;      //출력 : 지나간 방의 개수
        int room = 2;       //방 번호
        if(input == 1){
            System.out.println(count);
        }else {
            while(room <= input){
                room = room + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}

//1 -> 6 -> 12 -> 18 -> 24
//2 ~ 7 = 2(6칸)
//8 ~ 19 = 3(12칸)
//20 ~ 37 = 4(18칸)
//38 ~ 61 = 5(24칸)
//62 ~
