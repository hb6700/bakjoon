import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q30642_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int result = 0;

        //첫번째 줄 : IGRUS 동아리 방의 층 수 N
        int N = Integer.parseInt(br.readLine());

        //두번째 줄 = 화장실을 이용하려는 마스코트가 안뇽이면 "annyong", 인덕이면 "induck"
        String name = br.readLine();

        //세 번째 줄: 해당 마스코트가 현재 있는 층 K
        int K = Integer.parseInt(br.readLine());

        if(N >= K){
            if(name.equals("annyong")){
                if(K % 2 == 0){
                    result = K - 1;
                } else if (K % 2 != 0){
                    result = K;
                }
            }else if(name.equals("induck")){
                if(K % 2 == 0){
                    result = K;
                }else if(K % 2 != 0){
                    result = K - 1;
                }
            }
        }

        System.out.println(result);
    }
}
