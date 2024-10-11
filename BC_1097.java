public class BC_1097 {
    public static void main(String[] args) {

        printSequenciaIJL();

    }

    public static void printSequenciaIJL() {
        int j=7; int i=1;
        while (i<=9){
     for (int k = 0; k < 3; k++) {
        System.out.println("I=" + i + " J=" + j);
        j--;
     }
     j+=5; i+=2;
       
        }
    }
}
