import java.sql.SQLOutput;
import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. 대소문자 구분 없이 입력받기(대문자로 변환)
        String str = scan.next().toUpperCase();

        //2. 각 알파벳이 등장한 횟수 저장하기 위한 배열 생성(A~Z)
        int[] count = new int[26];

        //3. 문자열 길이만큼 알파벳 사용 횟수 계산
        for(int i=0 ; i<str.length() ; i++){
            int num = str.charAt(i) - 'A';
            count[num]++;
        }

        int max = 0;
        char ans = '?';

        for(int i=0 ; i<count.length ; i++){
            if(max < count[i]){
                max = count[i];
                ans = (char)(i+'A');
            }else if(max == count[i]){
                ans = '?';
            }
        }
        System.out.println(ans);
    }
}
