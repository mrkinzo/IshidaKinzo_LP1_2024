// prof. Odair - 15:05
import java.util.Scanner;

public class EduardoIshida_9999Frangolino {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        double media = 0;
        while (SC.hasNext()) {
            double[] vetFrango = new double[SC.nextDouble()];
            media = mediaFrangos(vetFrango);
            System.out.printf("Média = %2d\n", media);
        }
    }

    public static double mediaFrangos(double[] vetFrango) {
        double media = 0;
        double soma = 0;

        for (int i = 0; i < vetFrango.length; i++) {
            vetFrango[i] = insertN();
            soma += vetFrango[i];
        }
        media = soma / vetFrango.length;
        return media;
    }

    public static double insertN() {
        return SC.nextDouble();
    }
}
/*
 * Conceito D
 * 
 * Solução incompleta
 * 
 */