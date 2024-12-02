
// prof. Odair - 15:05
import java.util.Scanner;

public class EduardoIshida_1789Lesmas {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int testes = 0;
        int velocidadeLesma = 0;

        while (Sc.hasNext()) {
            testes = insertN();
            int[] vetLesma = new int[testes];
            velocidadeLesma = calcularVelLesma(vetLesma);
            System.out.println(velocidadeLesma);
        }
        System.out.println(velocidadeLesma);
    }

    public static int calcularVelLesma(int[] vetLesma) {
        int velocidadeLesma = 0;
        int velMax = 0;

        for (int i = 0; i < vetLesma.length; i++) {
            vetLesma[i] = insertN();
            velMax = Math.max(velMax, vetLesma[i]);

            if (velMax < 10) {
                velocidadeLesma = 1;
            } else {
                if (velMax >= 10 && velMax < 20) {
                    velocidadeLesma = 2;
                } else {
                    velocidadeLesma = 3;
                }
            }
        }
        return velocidadeLesma;
    }

    public static int insertN() {
        return Sc.nextInt();
    }
}

// Conceito B