import java.util.Scanner;

public class BC_2311 {

    public static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        float grauDif = 0;
        float notaFinal = 0;
        float nota = 0;
        float somaNota = 0;
        float maiorNota = 0;
        float menorNota = 10;
        String nome = null;
        int competidores = 0;
        
        competidores = Scan.nextInt();

        for (int i = 0; i < competidores; i++) {
            calcularSaltos(grauDif, notaFinal, nota, somaNota, maiorNota, menorNota, nome);
        }
    }

    public static void calcularSaltos(float grauDif, float notaFinal, float nota, float somaNota, float maiorNota,
            float menorNota, String nome) {

        nome = Scan.next();

        grauDif = Scan.nextFloat();

        for (int j = 0; j < 7; j++) {

            nota = Scan.nextFloat();
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }else {
                somaNota+=nota;
            }

            notaFinal = somaNota * grauDif;

          printDados(nome, notaFinal);
        }
    
    }
    public static void printDados(String x , float a){
        System.out.printf("%s %.2f\n", x, a);
    }
}
