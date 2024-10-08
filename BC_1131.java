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
        int t = 0;
        String vencedor = null;

        do {
            System.out.println("Novo grenal (1-sim 2-nao)");
      
            t = requestInt();
            while (t != 1 || t != 2) {
                t = requestInt();   
            }
                golsGremio = requestInt();
                golsinter = requestInt();

                if (golsGremio < golsinter) {
                    vitoriasG++;
                } else {
                    if (golsGremio == golsinter) {

                        empates++;

                    } else {
                        vitoriasI++;
                    }
        
            }

        }while (t!=2);
      
        System.out.printf("%d grenais/n",(vitoriasG+vitoriasI+empates));
        System.out.printf("Inter :%d", vitoriasI);
        System.out.printf("Gremio :%d", vitoriasG);
        System.out.printf("Empates :%d", empates);
        System.out.printf("%d venceu mais", vencedor);
    }

}
