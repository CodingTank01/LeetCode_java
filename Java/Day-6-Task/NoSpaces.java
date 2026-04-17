/* Remove all spaces from a string */

import java.util.*;

public class NoSpaces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        String out="";
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch!=' ') out=out+ch;
        }
        System.out.print("Output: "+out+"\n");

        sc.close();
    }
}