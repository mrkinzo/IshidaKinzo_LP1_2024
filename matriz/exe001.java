package matriz;

import java.util.Random;
import java.util.Scanner;

public class exe001 {

    final static Scanner LER = new Scanner(System.in);
    final static Random GERADOR = new Random();

    public static void main(String[] args) {

        int n = 0;
        int m = 0;
        int soma = 0;
        int k = 9;
        int media = 0;
        n = lerInt();
        m = lerInt();

        int[][] mat;

        // System.out.println("Criando a matriz");
        mat = criarMatriz(n, m);

        // System.out.println("Inicializando a matriz");
        mat = inicializarMatriz(mat, k);

        // System.out.println("imprimindo matriz inicializada");
        // imprimirMatriz(mat);

        // System.out.println("lendo a matriz");
        mat = lerMatriz(mat);
        soma = somarMat(mat);
        media =calcularMediaMat(soma, mat);
                // System.out.println("imprimindo Matriz");
                imprimirMatriz(mat, soma, media);

    }

    public static void imprimirMatriz(int[][] mat, int soma, int media) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println(soma);
        System.out.println(media);
    }

    public static int calcularMediaMat(int soma, int[][] mat) {
        int media = 0;
        media = soma / mat.length * mat[0].length;
        return media;
    }

    public static int[][] lerMatriz(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                // System.out.print("matriz[" + i + "][" + j + "]=");
                mat[i][j] = GERADOR.nextInt(100);
            }
        }
        return mat;
    }

    public static int[][] inicializarMatriz(int[][] mat, int k) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = k;
            }
        }
        return mat;
    }

    public static int[][] criarMatriz(int n, int m) {

        int[][] mat = new int[n][m];

        return mat;
    }

    public static int lerInt() {
        int n = 0;

        do {
            n = LER.nextInt();
        } while (n <= 0 || n > 10);

        return n;
    }

    public static int lerIntMat() {
        int n = 0;

        do {
            n = LER.nextInt();
        } while (n <= 0 || n > 1000);

        return n;
    }

    public static int somarMat(int[][] mat) {
        int soma = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                soma += mat[i][j];
            }
        }
        return soma;
    }
    public static int mostrarMenorN(int[][]mat){
        int menorN=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                ma
            }
        }
    }
}