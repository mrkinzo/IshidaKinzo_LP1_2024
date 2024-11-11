import java.util.Scanner;

public class vetor {

    final static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n=0;
        
        n=insertInt();
        int[] vet = new int[]{n};
        int[] vet2 = new int[]{n};
        
    }
    // public static int[] setArray(){
    //  int vet;
    //  vet=new int[]{insertInt()};
    //  return vet;
    // }
    public static int insertInt(){
    int x = 0;
     x = SC.nextInt();
     return x;
    }
    public static int[] inverterCasas(int[] vet){
        int t=5;
        int ty=2;
        vet[t]=vet[ty];
    }
}