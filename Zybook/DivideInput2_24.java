package Zybook;
import java.util.Scanner;

public class DivideInput2_24 {
   public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);
         int userNum =  scnr.nextInt();
         int divNum = scnr.nextInt();
         
         int result = (int) userNum / divNum;
         int resultt = (int) result / divNum;
         int resulttt = (int) resultt / divNum;
         
         System.out.println(result + " " + resultt + " " + resulttt);
         scnr.close();
   }
}
