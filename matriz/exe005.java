package matriz;

import java.util.Random;
import java.util.Scanner;

public class exe005 {

    final static Scanner LER = new Scanner(System.in);
    final static Random GERADOR = new Random();

    public static void main(String[] args) {

        int n = 0;
        int m = 0;
        int k = 9;
        n = lerInt();
        m = lerInt();

        int[][] mat;

        mat = criarmat(n, m);

        mat = inicializarmat(mat, k);

        mat = lermat(mat);

        int[] vetCol = new int[mat[0].length];

        vetCol = obtervetcolPrincipal(mat);

        imprimirmat(vetCol, mat);

    }

    public static void imprimirmat(int[] vetCol, int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.printf(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < vetCol.length; i++) {
            System.out.print(vetCol[i] + " ");
        }
        System.out.println();
    }

    public static int[][] lermat(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                // System.out.print("mat[" + i + "][" + j + "]=");
                mat[i][j] = GERADOR.nextInt(100);
            }
        }
        return mat;
    }

    public static int[][] inicializarmat(int[][] mat, int k) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = k;
            }
        }
        return mat;
    }

    public static int[][] criarmat(int n, int m) {

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

    public static int[] obtervetcolPrincipal(int[][] mat) {
        if (mat.length != mat[0].length) {
            return null;
        }

        int[] vetcol = new int[mat.length];

        vetcol[0] = mat[0][0];
        for (int i = 1; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    vetcol[i] = mat[i][j];
                }
            }
        }
        return vetcol;
    }


}
