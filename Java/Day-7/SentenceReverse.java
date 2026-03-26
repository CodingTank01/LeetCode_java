/* Reverse the order of words in a sentence */

import java.util.*;

public class SentenceReverse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        String out = wordRev(str1);
        System.out.print("Output: " + out+"\n");
    }

    static String wordRev(String s){
        char[] str = s.toCharArray();
        rev(str, 0, str.length-1);
        for(int i=0; i<str.length; i++){
            int start=i;
            while(i<str.length && str[i]!=' ') i++;
            rev(str, start, i-1);
        }
        return new String(str);
        
    }
    
    static void rev(char[] s, int start, int end){
        while(start<s.length && end>=0 && start<end){
            char ch = s[start];
            s[start]=s[end];
            s[end]=ch;
            start++;
            end--;
        }
    }
}