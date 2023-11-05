////import java.util.Scanner;
////
////public class Q2292 {
////    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        int roomNum = scan.nextInt();
////
////        //1 -> 6 -> 12 -> 18 -> 24
////        //2 ~ 7 = 2
////        //8 ~ 19 = 3
////        //20 ~ 37 = 4
////        //38 ~ 61 = 5
////        //62 ~
////
////        //int plural = 2;
////
////        int route;
////
////        if(roomNum == 1){
////            System.out.print(1);
////        }else{
////
////            System.out.print(0);
////        }
////    }
////}
////
////
////package bronze;
////
////        import java.io.BufferedReader;
////        import java.io.IOException;
////        import java.io.InputStreamReader;
//
//// 2292 벌집 브론즈2
//public class Q2292 {
//    public static void main(String[] args) throws IOException {
//
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int N = Integer.parseInt(br.readLine());
//
//        int count = 1; // 거리
//        int range = 2; // 범위
//
//        if (N == 1) {
//            System.out.println(1);
//        } else {
//            while (range <= N) {
//                range = range + (6 * count);
//                count++;
//            }
//            System.out.println(count);
//        }
//    }
//}
//
