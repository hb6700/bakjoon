import java.util.Scanner;

public class Q1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();     //행(row)
        int m = scan.nextInt();     //열(col)
        scan.nextLine();
        String[] line = new String[n];
        for (int i=0 ; i<n ; i++){
            line[i] = scan.nextLine();
        }

        int result = 0;
        int board = Integer.MAX_VALUE;
        for (int i=0 ; i<=n ; i++){
            for (int j=0 ; j<=m ; j++){
                String[] originalBoard = {"WBWBWBWB", "BWBWBWBW"};
                int whiteBoard = 0;
                for (int k=0 ; k<8 ; k++){
                    int row = k+i;
                    for (int l=0 ; l<8 ; l++){
                        int col = l+j;
                        if (line[row].charAt(col) != originalBoard[row%2].charAt(j)){
                            whiteBoard++;
                        }
                    }
                    result = Math.min(whiteBoard, 64-whiteBoard);
                }
                if(board > whiteBoard){
                    board = whiteBoard;
                }
            }
        }
        System.out.println(result);
    }
}
