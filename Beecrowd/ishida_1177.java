package Beecrowd;

import java.util.Scanner;

public class ishida_1177 {
final static Scanner SC= new Scanner(System.in);

public static void main(String[] args) {
    final int N = 1000;
        int[] vetor = new int[N];
        int v = 0;

        v = lerNum();
        vetor = preencherVetor2(vetor, v);
        printX(vetor);
}
public static int[] preencherVetor2(int[] vetor, int v) {

    for (int i = 0; i < vetor.length; i++) {
        if (i<v) {
            
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

    while (v>2 && v > 50) {
        v = SC.nextInt();
    }
    return v;
}
}
