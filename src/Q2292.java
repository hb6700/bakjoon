import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roomNum = scan.nextInt();

        //1 -> 6 -> 12 -> 18 -> 24
        //2 ~ 7 = 2
        //8 ~ 19 = 3
        //20 ~ 37 = 4
        //38 ~ 61 = 5
        //62 ~

        //int plural = 2;

        int route;

        if(roomNum == 1){
            System.out.print(1);
        }else{

            System.out.print(0);
        }
    }
}
