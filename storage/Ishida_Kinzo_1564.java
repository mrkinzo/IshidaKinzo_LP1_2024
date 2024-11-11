import java.util.Scanner;

public class Ishida_Kinzo_1564 {
    final static Scanner Scn = new Scanner(System.in);

    public static void main(String[] args) {
        while (Scn.hasNext()) {
            int recalque = 0;
            recalque = requestInt();
            if (recalque == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }

    }

    public static int requestInt() {
        int x = 0;
        x = Scn.nextInt();
        while (x < 0 || x > 100) {
            x = Scn.nextInt();
        }
        return x;
    }

}