import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stdNum = scan.nextInt();
        if(3>stdNum || stdNum>1000)
        {
            return;
        }
        int aScore = 0, bScore = 0, cScore = 0;
        int a3Count = 0, b3Count = 0, c3Count = 0;
        int a2Count = 0, b2Count = 0, c2Count = 0;

        for (int i = 0; i < stdNum; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            aScore += a;
            bScore += b;
            cScore += c;

            if (a == 3) {
                a3Count++;
            } else if (a == 2) {
                a2Count++;
            }

            if (b == 3) {
                b3Count++;
            } else if (b == 2) {
                b2Count++;
            }

            if (c == 3) {
                c3Count++;
            } else if (c == 2) {
                c2Count++;
            }
        }

        // 점수 비교
        if (aScore > bScore && aScore > cScore) {
            System.out.println("1 " + aScore);
        } else if (bScore > aScore && bScore > cScore) {
            System.out.println("2 " + bScore);
        } else if (cScore > aScore && cScore > bScore) {
            System.out.println("3 " + cScore);
        } else {
            if (a3Count > b3Count && a3Count > c3Count) {
                System.out.println("1 " + aScore);
            } else if (b3Count > a3Count && b3Count > c3Count) {
                System.out.println("2 " + bScore);
            } else if (c3Count > a3Count && c3Count > b3Count) {
                System.out.println("3 " + cScore);
            } else {
                if (a2Count > b2Count && a2Count > c2Count) {
                    System.out.println("1 " + aScore);
                } else if (b2Count > a2Count && b2Count > c2Count) {
                    System.out.println("2 " + bScore);
                } else if (c2Count > a2Count && c2Count > b2Count) {
                    System.out.println("3 " + cScore);
                } else {
                    System.out.println("0 " + aScore);
                }
            }
        }
    }
}
