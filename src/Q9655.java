import java.util.Scanner;

//백준 9655
public class Q9655 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        if(N % 2 == 1){
            System.out.print("SK");
        }else{
            System.out.print("CY");
        }
    }
}
