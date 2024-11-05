package Beecrowd;

import java.util.Scanner;

public class Ishida1173 {

    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        final int N = 10;
        int[] vetor = new int[N];

        int v = 0;

        v = lerNum();
        vetor = preencherVetor(vetor, v);
        printX(vetor);

    }

    public static int[] preencherVetor(int[] vetor, int v) {

        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                vetor[i] = v;
            } else {
                vetor[i] = vetor[i-1] * 2;
            }
        }
        return vetor;

    }

    public static void printX(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i +"] = " + vetor[i]);
        }
    }

    public static int lerNum() {

        int v = 0;
        v = SC.nextInt();

        while (v > 50) {
            v = SC.nextInt();
        }
        return v;
    }

}
