import java.util.Scanner;

public class TCA_AgndCConsulta {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        imprimirMenu();
     //   int qtdRegistros = lerNumInt();
        

       // String[][] paginas = criarMatrizString(qtdRegistros, 4); // [0] = mes , [1]  dia , [2] tipo , [3] = log
        
    }

    public static void imprimirMenu(){
        final String formato = "MM/DD/TIPO/REGISTRO";
        final String exemplo = "10/31/(P)/Halloween";

        System.out.println("----------------------------------------------------------");
        System.out.println("1- para REGISTRAR ");
        System.out.println("2- para CONSULTAR REGISTROS");
        System.out.println("----------------------------------------------------------");
        
        int comando = LER.nextInt();

        switch (comando) {
            case 1:
            System.out.println();
                System.out.println("Digite DIAS em NUMEROS INTEIROS");
                System.out.println("Digite MÊS em NUMEROS INTEIROS");
                System.out.println("Digite TIPO em 1 Caractere baseado no significado abaixo: ");
                System.out.println("[P] = Registro PESSOAL");
                System.out.println("[E] = Registro ESTUDANTIL");
                System.out.println("Digite na ordem: " + formato);
                System.out.println("Exemplo: " + exemplo);
                System.out.println();
                break;
            case 2:
            System.out.println();
            System.out.println("Digite o mês que deseja consultar");
            System.out.println("Digite em seguida o DIA(S) que deseja consultar");
            System.out.println("Digite um caractere baseado na tabela abaixo: ");
            System.out.println("[1] = Consultar APENAS os REGISTROS do tipo PESSOAL");
            System.out.println("[2] = Consultar APENAS os REGISTROS do tipo ESTUDANTIL");
            System.out.println("[3] = Consultar registros de TODOS OS TIPOS");
            System.out.println("Exemplo: ");

            System.out.println("Mês: 10");
            System.out.println("Dia: 31");
            System.out.println("1");

            System.out.println("____________________RELATORIO____________________");
            System.out.println("No dia 31 do Mês 10 você tem: ");
            System.out.println();
        }
               
    }


}
