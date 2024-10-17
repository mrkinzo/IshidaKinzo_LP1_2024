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

            y = SC.nextInt();
            while (y < 1 && y > 10000) {
                y = SC.nextInt();
            }
            if (y == 0) {
                break;
            }
            for (int i = 0; i < y; i++) {
                moeda = SC.nextInt();
                while (moeda != 0 || moeda != 1) {
                    moeda = SC.nextInt();
                }
                if (moeda == 1) {
                    vitoriasJ++;
                } else {
                    vitoriasM++;
                }
            }
               printWin(vitoriasM,vitoriasJ);
        }
    }
    public static void printWin(int x,int y){
        System.out.printf("Maria venceu %i vezes e João venceu %i vezes\n", y, x);
    }
}
