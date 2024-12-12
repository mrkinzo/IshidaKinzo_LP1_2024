import java.util.Scanner;


public class TCA_AgendaComConsulta {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
       int qtdRegistros=lerNumInt();
       int prompt=0;
       
       integerToString();
       
        imprimirMenu();
        boolean tutorial = verificarComandoParaTutorial();
        while (tutorial) {
            imprimirTutorial();
            tutorial = verificarComandoParaTutorial();
        }

        
        do{
            prompt=lerNumInt();
            if (tutorial) {
                
            }



        }while(prompt!=0);




        // int qtdRegistros = lerNumInt();

        String[][] paginas = criarMatrizString(qtdRegistros, 4); 
        //dia , [2] tipo , [3] = log


        final String [] MESES={"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro","dezembro"};
        final String [] DIAS={"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira ", "sábado"};


    }

    public static int lerNumInt() {
        int x = 0;
        do {
            x = LER.nextInt();
        } while (x < 0);
        return x;
    }

    public static boolean verificarComandoParaTutorial() {
        boolean repetir = false;
        int comando = lerNumInt();
        if (comando == 3) {
            repetir = true;
        }
        return repetir;
    }

    public static String insertString (){
        String x=null;
        x=LER.nextLine();
        return x;
    }

    public static void imprimirTutorial() {
        final String formato = "MM/DD/TIPO/REGISTRO";
        final String exemplo = "10/31/(P)/Halloween";
        System.out.println();
        System.out.println("____________________________________________________________");
        System.out.println("Como REGISTRAR: ");
        System.out.println("Digite DIAS em NUMEROS INTEIROS");
        System.out.println("Digite MÊS em NUMEROS INTEIROS");
        System.out.println("Digite TIPO em 1 Caractere baseado no significado abaixo: ");
        System.out.println("[P] = Registro PESSOAL");
        System.out.println("[E] = Registro ESTUDANTIL");
        System.out.println("Digite na ordem: " + formato);
        System.out.println("Exemplo: " + exemplo);
        System.out.println("____________________________________________________________");
        System.out.println();

        System.out.println();
        System.out.println("____________________________________________________________");
        System.out.println("Como CONSULTAR: ");
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

        System.out.println("----------------------------------------------------------");
        System.out.println("1- para REGISTRAR ");
        System.out.println("2- para CONSULTAR REGISTROS");
        System.out.println("3- para ver como operar a agenda");
        System.out.println("0- para encerrar o programa");
        System.out.println("----------------------------------------------------------");

        System.out.println("O que você deseja fazer?");

    }

    public static void imprimirMenu() {

        System.out.println("----------------------------------------------------------");
        System.out.println("_Agenda com consulta_");
        System.out.println("1- para REGISTRAR ");
        System.out.println("2- para CONSULTAR REGISTROS");
        System.out.println("3- para ver como operar a agenda");
        System.out.println("0- para encerrar o programa");
        System.out.println("----------------------------------------------------------");

        System.out.println("O que você deseja fazer?");
    }
 public static String[][] criarMatrizString(int linhas, final int colunas) {
        String[][] matrizString = criarMatrizString(linhas, colunas); // [0] = mes , [1] dia , [2] tipo , [3] = log
        return matrizString;
    }
    public static void NerdOut(){

        System.out.println();
    }
    public static void integerToString(){
      LER.next().charAt
    }
}
