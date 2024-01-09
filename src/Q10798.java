import java.util.Scanner;

//백준 10798
public class Q10798 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //총 다섯 줄의 입력, 최대 15개의 글자
        char[][] text = new char[5][15];

        //배열에 값 입력
        for (int i=0 ; i<5 ; i++){
            String input = scan.nextLine();
            for(int j=0; j<input.length() ; j++){
                text[i][j] = input.charAt(j);
            }
        }

        //기존 배열 세로로 변경
        for(int i=0 ; i<15 ; i++){
            for(int j=0 ; j<5 ; j++){
                if(text[j][i] != '\0'){
                    System.out.print(text[j][i]);
                }
            }
        }
    }
}
