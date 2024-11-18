package Beecrowd;

import java.util.Scanner;

public class ishida_2791 {
final static Scanner SC=new Scanner(System.in);

public static void main(String[] args) {
    int[]vetCopo=new int[4];
    for (int i = 0; i <vetCopo.length; i++) {
        vetCopo[i]=lerVet();
        if (vetCopo[i]==1) {
            System.out.println(i+1);
        }
    }
}

    public static int lerVet() {
   
        return SC.nextInt();
    }
}