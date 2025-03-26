/*Find the maximum & minimum number in an array of integers.*/
import java.util.*;
public class Exrecise {
   public static void Fun() {
      int marks[] = {90, 34, 43, 4334,1,3, 43 };
      int maxint = marks[0];
      int man = marks[0];
      for (int i = 1; i < marks.length; i++) {
         if (marks[i] > maxint) {
           maxint=marks[i];
         }
         if (marks[i] < man) {
          man = marks[i] ;
         }
      }
      System.out.println("The maximum number in array is : " + maxint);
      System.out.println("The manimum number in array is : " + man);
   }
   public static void main(String[] args) {
      Fun();
   }
}
