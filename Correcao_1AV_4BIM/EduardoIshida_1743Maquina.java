
// prof. Odair - 15:05
import java.util.Scanner;

public class EduardoIshida_1743Maquina {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetPlug1 = new int[5]; 
        int[] vetPlug2 = new int[5];
        String funfa = null;
        funfa = compararCompatibilidade(vetPlug1, vetPlug2);
        System.out.println(funfa);
    }

    public static String compararCompatibilidade(int[] vetPlug1, int[] vetPlug2) {
        String funfa = null;
        
        // método para ler
        for (int i = 0; i < vetPlug1.length; i++) {
            vetPlug1[i] = insertN();
        }

        // método para ler
        for (int j = 0; j < vetPlug2.length; j++) {
            vetPlug1[j] = insertN();
        }

        // aqui sim
        for (int i = 0; i < vetPlug1.length; i++) {
            if (vetPlug1[i] != vetPlug2[i]) {
                funfa = "Y";
            } else {
                funfa = "N";
            }
        }
        return funfa;
    }

    public static int insertN() {
        return Sc.nextInt();
    }
}
/* 

Conceito B

separar por método as leituras

*/