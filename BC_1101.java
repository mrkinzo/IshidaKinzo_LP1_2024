import java.util.Scanner;

public class BC_1101 {
    public static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        double lim1 = 0;
        double lim2 = 0;
       
        calcularDoubleervalo(lim1, lim2);
    }

    public static void calcularDoubleervalo(double lim1, double lim2) {
        
       while (lim1!=0&&lim2!=0) {
        lim1 = SCAN.nextDouble();
        lim2 = SCAN.nextDouble();
        double limMax = encontreLimiteMaximo(lim1, lim2);
        double limMin = encontreLimiteMin(lim1, lim2);
        double i = limMin;
         while ( i <= limMax) {  
             System.out.print(i + " ");
             i++;
         }
         System.out.print("Sum="+i);
 
       }
    }

    public static double encontreLimiteMaximo(double lim1, double lim2) {
        double x = 0;
        x = Math.max(lim1, lim2);
        return x;
    }

    public static double encontreLimiteMin(double lim1, double lim2) {
        double y = 0;
        y = Math.min(lim1, lim2);
        return y;
    }
}
