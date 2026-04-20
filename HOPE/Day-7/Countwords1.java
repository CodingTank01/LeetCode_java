/* Count Words in a String */

import java.util.*;

public class Countwords1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if(str.trim().isEmpty()){
            System.out.println("Number of words in the string: 0");
            sc.close();
            return;
        }
        String[] words = str.split("\\s+");
        System.out.println("Number of words in the string: " + words.length);

        sc.close();
    }
}