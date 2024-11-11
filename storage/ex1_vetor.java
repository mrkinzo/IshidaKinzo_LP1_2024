import java.util.Scanner;

public class ex1_vetor {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 0;
        float mediaNotas = 0;
        int somaNotas = 0;
        n = lerN();

        int[] vetorNotas = new int[n];

        imprimirVetor(vetorNotas, somaNotas , mediaNotas);

        vetorNotas = lerNotas(vetorNotas);

        // notaX = vetorNotas[4];
        // System.out.println("nota X: " + notaX);
        somaNotas = somaVetorNotas(vetorNotas, somaNotas);
        mediaNotas=calcularMediaNotas(somaNotas, vetorNotas);

        imprimirVetor(vetorNotas, somaNotas,mediaNotas);

    }

    public static int[] lerNotas(int[] vetorNotas) {

        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": ");
            vetorNotas[i] = lerNota();
        }

        return vetorNotas;

    }

    public static int lerNota() {
        int nota = 0;
        do {
            nota = LER.nextInt();
        } while (nota < 0 || nota > 10);
        return nota;
    }

    public static void imprimirVetor(int[] vetorNotas, int somaNotas , float mediaNotas) {
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + vetorNotas[i]);
            System.out.println("soma " + somaNotas);
            System.out.println ("media "+mediaNotas);
        }
    }

    public static int somaVetorNotas(int[] vetorNotas, int somaNotas) {

        for (int i = 0; i < vetorNotas.length; i++) {
            somaNotas += vetorNotas[i];
        }
        return somaNotas;
    }
    public static float calcularMediaNotas(int somaNotas,int[]vetorNotas){
        float media=0f;

        media= (float) somaNotas/vetorNotas.length;
        return media;
    }

    public static int lerN() {
        int n = 0;

        do {
            System.out.println("N=");
            n = LER.nextInt();
        } while (n <= 0 || n > 10);

        return n;
    }
  
}
