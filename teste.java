public class teste {

    public static void main(String[] args) {
     String buraco = integerToString();
     System.out.println(buraco);
    }
    public static String integerToString(){
      int pa = 80085;
      String x = null;
      x=String.valueOf(pa);
      return x;
     }
}