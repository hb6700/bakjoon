import java.io.*;
import java.util.StringTokenizer;

public class Q10951 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String str = "";
            while ((str=br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(str);
                if (st.hasMoreTokens()){
                    bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
                }else {
                    break;
                }
            }
            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
