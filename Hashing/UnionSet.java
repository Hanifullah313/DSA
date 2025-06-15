package Hashing;

import java.util.*;
//O(n)
public class UnionSet {
    public static int Union(int set1[], int set2[]) {
        HashSet<Integer> Union = new HashSet<>();
         for(int i=0 ; i<set1.length; i++){
            Union.add(set1[i]);
         }
         for(int i=0 ; i<set2.length; i++){
            Union.add(set2[i]);
         }
         return Union.size();
    }

    public static void main(String[] args) {
      int set1[]={1,2,4,5};
      int set2[]={1,2,4,5,7,5,7,8,90};
      System.out.println(Union(set1,set2));
      
    }
}
