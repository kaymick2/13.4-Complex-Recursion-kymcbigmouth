import java.util.ArrayList;
import java.lang.*;

/**
   This program demonstrates the permutation generator.
*/
public class Main
{
   public static void main(String[] args)
   {
      PermutationGenerator generator = new PermutationGenerator("big");
      ArrayList<String> permutations = generator.getPermutations();
      for (String s : permutations)
      {         
         System.out.println(s);
      }
   }
}

