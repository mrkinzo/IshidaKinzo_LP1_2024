import java.util.Scanner;

public class BC_2862 {

    final static Scanner SCN =new Scanner(System.in);
    public static void main(String[] args) {
        printInseto();
    }
    public static void printInseto(){
        int c = 0;
        int p = 0;
        c=SCN.nextInt();
        for (int i = 0; i < c; i++) {
            p=SCN.nextInt();
            if (p>8000) {
                System.out.println("Mais de 8000!");
            }else{
                System.out.println("Inseto!");
            }
            
        }
    }
}