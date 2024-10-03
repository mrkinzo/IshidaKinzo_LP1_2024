public class BC_1095 {

    public static void main(String[] args) {
        int j = 1;
        for (int i = 60; i >= 0; i -= 5) {

            System.out.printf("I=%d J=%d", j, i);
            System.out.println();
            j += 3;
        }
    }
}