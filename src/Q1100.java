import java.util.Scanner;

public class Q1100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for(int i=0 ; i<8 ; i++){
            String line = scan.nextLine();
            for(int j=0 ; j<8 ; j++){
                if(line.charAt(j) == 'F' && (i+j)%2 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
