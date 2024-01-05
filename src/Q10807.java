import java.util.Scanner;

public class Q10807 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int num = scan.nextInt();
        int[] array = new int[num];

        //두번째 줄 입력 : 입력받을 개수 만큼
        for(int i=0 ; i<num ; i++){
            array[i] = scan.nextInt();
        }

        //세번째 줄 입력
        int v = scan.nextInt();

        for(int j=0 ; j<array.length ; j++){
            if(v == array[j]){
                count++;
            }
        }

        //결과 출력
        System.out.println(count);
    }
}
