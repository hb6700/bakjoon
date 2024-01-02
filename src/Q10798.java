import java.util.Scanner;

//백준 10798
public class Q10798 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다.
        char[][] text = new char[5][15];

        String input = "";
        for (int i=0 ; i<text.length ; i++){
            input = scan.nextLine();
            for(int j = 0; j < input.length(); j++){
                text[i][j] = input.charAt(j);
            }
        }

        for(int j=0; j < input.length(); j++){
            for (int i=0; i < text.length; i++){
                System.out.print(text[i][j]);
            }
        }
    }
}
