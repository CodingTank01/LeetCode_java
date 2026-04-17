/*N Remove all spaces from a string */

import java.util.*;

public class NoSpaces2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        char[] out = str1.toCharArray();
        int ptr = 0;
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch!=' ') out[ptr++]=ch;
        }
        System.out.print("Output: "+new String(out, 0, ptr)+"\n");

        sc.close();
    }
}