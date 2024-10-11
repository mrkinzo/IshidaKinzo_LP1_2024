import java.util.Scanner;

public class BC_1131 {
    final static Scanner SCN = new Scanner(System.in);

    // IN
    public static int requestInt() {

        int v = 0;
        v = SCN.nextInt();

        return v;
    }

    // main
    public static void main(String[] args) {

        int golsGremio = 0;
        int golsinter = 0;
        int vitoriasG = 0;
        int vitoriasI = 0;
        int empates = 0;
        int grenais = 0;
        String vencedor = null;

        do {
            grenais++;

            golsinter = requestInt();
            golsGremio = requestInt();

            if (golsGremio > golsinter) {

                vitoriasG++;

            } else if (golsGremio < golsinter) {

                vitoriasI++;

            } else {

                empates++;

            }
            System.out.println("Novo grenal (1-sim 2-nao)");
        } while (requestInt() == 1);

        if (vitoriasG > vitoriasI) {
            vencedor = "Gremio";
        } else if (vitoriasI > vitoriasG){
            vencedor = "Inter";
        } else {
            vencedor = "Empate";
        }

        System.out.println(grenais + " grenais");

        System.out.println("Inter:" + vitoriasI);

        System.out.println("Gremio:" + vitoriasG);

        System.out.println("Empates:" + empates);

        if (vencedor != "Empate") {
            System.out.println(vencedor + " venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }

}
