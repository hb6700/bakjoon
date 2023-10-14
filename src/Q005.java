//백준 18108
import java.util.Scanner;

public class Q005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("연도 입력 : ");
        int year = scan.nextInt();
        if(year<1000 || year>3000){
            return;
        }else{
            year = year-543;
            System.out.println(year);
        }
    }
}
