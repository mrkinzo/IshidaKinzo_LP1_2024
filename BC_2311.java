import java.util.Scanner;

public class BC_2311 {

    public static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        int competidores = 0;
        competidores = Scan.nextInt();

        for (int i = 0; i < competidores; i++) {
            calcularSaltos();
        }
    }

    public static void calcularSaltos() {
        float grauDif = 0;
        float notaFinal = 0;
        float nota = 0;
        float somaNota = 0;
    float maiorNota = 0;
    float menorNota = 0;
        String nome = null;

        grauDif = Scan.nextFloat();

        for (int i = 0; i < 7; i++) {
            nome = Scan.nextLine();
            nota = Scan.nextFloat();
            if (nota > maiorNota) {
                maiorNota += nota;
            }
            if (nota < menorNota) {
                menorNota += nota;
            } else {
                somaNota += nota;
            }

            notaFinal = somaNota * grauDif;

            printCompetitdor(nome, notaFinal);
        }
    }
    public static void printCompetitdor(String nome ,float notaFinal){
        System.out.printf("%s %.2f\n", nome, notaFinal);
    }
}
