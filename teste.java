public class teste {

    public static void main(String[] args) {
     String buraco = integerToString();
     System.out.println(buraco);
     charToStrg();
    }
    public static String integerToString(){
      int pa = 80085;
      String x = null;
      x=String.valueOf(pa);
      return x;
     }

     public static void charToStrg(){
        char v = 'P';
        String as= null;
        as=String.valueOf(v);
        System.out.println(as);
     }
}