import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        king = king - scan.nextInt();
        queen = queen - scan.nextInt();
        rook = rook - scan.nextInt();
        bishop = bishop - scan.nextInt();
        knight = knight - scan.nextInt();
        pawn = pawn - scan.nextInt();

        System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
    }
}
