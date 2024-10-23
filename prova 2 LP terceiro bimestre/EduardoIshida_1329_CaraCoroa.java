import java.util.Scanner;

public class EduardoIshida_1329_CaraCoroa {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = 0;
        calcularResultado(casos);

    }

    public static void calcularResultado(int y) {
        int vitoriasJ = 0;
        int vitoriasM = 0;
        int moeda = 0;

        while (true) {

            y = SC.nextInt(); // lê o y aqui mas somente depois testa, pq não usar o do-while, que lê pelo menos uma vez?

            while (y < 1 && y > 10000) { // fazer a validação no método.
                y = SC.nextInt();
            }
            System.out.println("__LINE__" + 24);
            if (y == 0) {
                break;
            }

            for (int i = 0; i < y; i++) {
                moeda = SC.nextInt();
                //while (moeda != 0 || moeda != 1) { // essa validação fazer no método.
                    // moeda = SC.nextInt();
                //}
                System.out.println("__LINE__" + 34);
                if (moeda == 1) {
                    vitoriasJ++;
                } else {
                    vitoriasM++;
                }
            }
            printWin(vitoriasM, vitoriasJ);
            // ten que zerar a quantidade de vitórias deles quando termina a partida
        }
    }

    public static void printWin(int x, int y) {
        System.out.printf("Maria venceu %d vezes e João venceu %d vezes\n", y, x); // %i para inteiro é %d há muitos anos...
    }
}
/* Conceito C
 * 
 * Usar melhor os métodos, separar melhor as funcionalidades.
 * Tem pequenos erros de falta de pratica.
 *  * 
 * Ir nos atendimentos fazer as atividades de recuperação para melhorar a sua boas práticas de programação
 */