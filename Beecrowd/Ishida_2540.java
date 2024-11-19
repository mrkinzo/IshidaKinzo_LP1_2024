package Beecrowd;

import java.util.Scanner;

public class Ishida_2540 {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = 0;
        while (SC.hasNext()) {
            int votosAFavor = 0;
            int votosContra = 0;
            double doisTercos = 0;
            casos = lerVet();
            doisTercos = (2.0 / 3) * casos;
            int[] vetImpeachmeant = new int[casos];
            for (int i = 0; i < vetImpeachmeant.length; i++) {
                vetImpeachmeant[i] = lerVet();
                if (vetImpeachmeant[i] == 1) {
                    votosAFavor++;
                } else {
                    votosContra++;
                }
            }
            if (votosAFavor >= doisTercos) {
                System.out.println("impeachment");
            } else {
                System.out.println("acusacao arquivada");
            }
        }
    }

    public static int lerVet() {

        return SC.nextInt();
    }

}
