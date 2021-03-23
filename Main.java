import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

/**
 * This program demonstrates the permutation generator.
 */
public class Main {
  public static void main(String[] args) {
    Scanner seFodeu = new Scanner(System.in);
    System.out.println("enter word 4 permutation thing : ");
    String morre = seFodeu.next();
    PermutationGenerator generator = new PermutationGenerator(morre);
    ArrayList<String> permutations = generator.getPermutations();
    System.out.println(permutations.size());
    for (String s : permutations) {
      System.out.println(s);
    }
  }
}
