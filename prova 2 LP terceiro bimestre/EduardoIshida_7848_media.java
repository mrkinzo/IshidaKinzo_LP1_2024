import java.util.Scanner;

public class EduardoIshida_7848_media {

    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
     int turmas=0;
     int notas=0;
     descobrirAcimaDaMedia(turmas, notas);
    }
    public static void descobrirAcimaDaMedia( int turmas, int notas){
        int casos=0;
        casos = SC.nextInt();
        int soma=0;
        float media =75.548f;
        float perCent=0f;
       for (int i = 0; i < casos; i++) {
        
         turmas=SC.nextInt () ;
         notas=SC.nextInt ();
         soma+=notas;
       }
       perCent= soma/media;
       System.out.printf("%.3f %\n",perCent);
    }
}
