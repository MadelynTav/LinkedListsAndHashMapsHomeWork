package nyc.c4q.accesscode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 10/20/15.
 * Hashtables Homework
 */
public class Anagrams
{
    public static boolean compareTheWords(String one, String two){
        one=one.toLowerCase().trim();
        char [] oneSplit=one.toLowerCase().trim().toCharArray();

        char [] twoSplit=two.toLowerCase().trim().toCharArray();
        Map<Character, Integer> word1= new HashMap<Character, Integer>();
        for(char e: oneSplit){
            int amount;
            if(word1.containsKey(e)){
                amount=word1.get(e);
                amount++;
                word1.put(e, amount);
            } else {
                word1.put(e,1);
            }

        }


        Map<Character,Integer> word2=new HashMap<Character, Integer>();

        for(char e: twoSplit){
            int amount;
            if(word2.containsKey(e)){
                amount=word2.get(e);
                amount++;
                word2.put(e,amount);
            } else {
                word2.put(e,1);
            }
        }
        System.out.println(word1);
        System.out.println(word2);
        if(word1.equals(word2)){
            return true;
        }
        return false;
    }


    public static void main(String[] args)
    {
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter One Word to Compare");
//        String one=scanner.nextLine();
//        System.out.println("Enter A Second Word To Compare");
//        String two=scanner.next();

        String one="eleven plus two";
        String two="twelve plus one";
        System.out.println(compareTheWords(one,two));


    }
}
