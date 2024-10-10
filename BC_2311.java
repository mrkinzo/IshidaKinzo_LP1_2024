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
        int grauDif = 0;
        int notaFinal = 0;
        double nota = 0;
        int somaNota = 0;
        double maiorNota = 0;
        double menorNota = 0;
        String nome = null;

        grauDif = Scan.nextInt();

        for (int i = 0; i <= 7; i++) {
            nome = Scan.nextLine();
            nota = Scan.nextDouble();
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
    public static void printCompetitdor(String nome , double notaFinal){
        System.out.printf("%s %.2f/n", nome, notaFinal);
    }
}
