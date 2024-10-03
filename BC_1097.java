public class BC_1097 {
    public static void main(String[] args) {

        printSequenciaIJL();

    }

    public static void printSequenciaIJL() {
        for (int i = 1; i <=3; i++) {
            
            for ( int j = 7; j < 13; j += 5) {

                System.out.printf("I=%d J=%d", j, i);
                System.out.println();
            }
        }
    }
}
