import java.util.Scanner;

public class KinzoIshida_1547_Advinha {
    final static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int camisetas = 0;
        int numeroAdv = 0;
        int estdantes = 0;
        int casos = 0;

        procurarVencedor(casos, numeroAdv, estdantes, camisetas);
    }

    public static void procurarVencedor(int casos, int numeroAdv, int estdantes, int camisetas) {
        camisetas = Sc.nextInt();
        int numAluno = 0;
        int alunos = 1;
        int numAprox = 0;

        for (int i = 0; i < camisetas; i++) {

            casos = Sc.nextInt();
            numeroAdv = Sc.nextInt();

            while (alunos < casos) {
                numAluno = Sc.nextInt();
                numAprox = numAluno - numeroAdv;

                if (numAprox == 1 || numAprox == 0) {
                    System.out.println(alunos);

                }
                alunos++;

            }
        }

    }
}
/*
 * Conceito D
 * 
 * Ir nos atendimentos para fazer as atividades de recuperação.
 * 
 * Fazer as atividades durante as aulas, tem feito poucas atividades.
 * 
 */