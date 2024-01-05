import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //중복값 입력 불가
        HashSet<Integer> h = new HashSet<>();

        //10개의 값을 입력받아 각각 42로 나누어 HashSet에 집어넣음
        for(int i=0 ; i<10 ; i++){
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(h.size());
    }
}
