package Beecrowd;

import java.util.Scanner;

public class NegocioDoKpiroto_Adivinha {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdTestes = 0;
        int qtdChutes = 0;
        int[]chutes=new int[lerNum()];
        int chute = 0;
        int valorAdv = 0;
        int melhorChute=0;
        qtdTestes=lerNum();
        for (int i = 0; i < qtdChutes; i++) {
            
        }
         



/* 

        n = lerNum();
        qtdChutes = lerNum();
        for (int index = 0; index <= n; index++) {
            
            valorAdv = lerNum();
            int[] vetChutes = new int[qtdChutes];
            for (int i = 0; i < vetChutes.length; i++) {
                chute = lerNum();
                vetChutes[i] = chute;
                if (valorAdv - chute == 1 || valorAdv - chute == 0) {
                    System.out.println(i + 1);
                }
            }
        }
*/

    }

    public static int lerNum() {
        return SC.nextInt();
    }
}
