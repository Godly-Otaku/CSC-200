package Unit4;

public class Cubed {
   public static void main(String[] args){
      int n = 0;
      while (true) {
            if ((Math.pow(n,3)) < 12000) {
                n++;
            } else 
                break;
      }
      System.out.println((n-1) + " is the largest integer less than 12,000");
   }
}