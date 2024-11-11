import java.util.Scanner;

public class BC_1113 {

    final static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        int l = 0;
        int b = 0;

        while (SCAN.hasNext()) {
            b = SCAN.nextInt();
            l = SCAN.nextInt();
            if (b < l) {
                System.out.println("Crescente");
            } else {
                if (b > l) {
                    System.out.println("Decrescente");
                } else {
                    if (b == l) {
                        break;
                    }
                }
            }
        }

    }

}