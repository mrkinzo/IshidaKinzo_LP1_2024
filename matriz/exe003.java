package matriz;

import java.util.Random;
import java.util.Scanner;

public class exe003 {

    final static Scanner LER = new Scanner(System.in);
    final static Random GERADOR = new Random();

    public static void main(String[] args) {

        int n = 0;
        int m = 0;
        int soma = 0;
        int k = 9;
        n = lerInt();
        m = lerInt();
        int linha=0;

        int[][] mat;    

      
        mat = criarMatriz(n, m);

       
        mat = inicializarMatriz(mat, k);

      
        mat = lerMatriz(mat);
        
        int[]vetCol=new int[mat[0].length];

        vetCol=vetColuna(mat, vetCol);     

          imprimirMatriz(vetCol,mat);

    }

    public static void imprimirMatriz(int[] vetCol,int [][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
            System.out.printf(mat[i][j] + " ");
            }
            System.out.println();
            }
            
            System.out.println();
        for (int i = 0; i < vetCol.length; i++) {
            System.out.print(vetCol[i]+ " ");
        }
        System.out.println();
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

    public static int [] vetColuna (int [][] mat,int[] vetCol){
        System.out.println("selecione linha");
        int linha=lerInt();
     for (int i = 0; i < mat.length; i++) {
       for (int index = 0; index < linha; index++) {
        vetCol[i]=mat[i][linha];
       }
     }
    return vetCol;
    }

}
