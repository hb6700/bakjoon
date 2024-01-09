import java.util.Scanner;
//팰린드롬 : 앞으로 읽을때와 거꾸로 읽을 때 똑같은 단어
public class Q10988 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length = word.length();

        for(int i=0 ; i<length/2 ; i++){
            char front = word.charAt(i);
            char back = word.charAt((length-1)-i);

            if(front != back){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
