package Beecrowd;
import java.util.Scanner; 
public class Ishida_1796 {

    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = 0;
        
            int votosAFavor = 0;
            int votosContra = 0;
            double metade = 0;
            casos = lerVet();
            metade =casos/2;
            int[] vetImpeachmeant = new int[casos];
            for (int i = 0; i < vetImpeachmeant.length; i++) {
                vetImpeachmeant[i] = lerVet();
                if (vetImpeachmeant[i] == 1) {
                     votosContra++;
                } else {
                  votosAFavor++; 
                }
            }
            if (votosAFavor > metade) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
    }

    public static int lerVet() {

        return SC.nextInt();
    }

}


