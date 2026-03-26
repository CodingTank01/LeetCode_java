/* Count the frequency of each character in a string */

import java.util.*;

public class freqOfChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        freq(str1);
    }

    static void freq(String s){
        int[] freq = new int[256];
        for(int i=0; i<256; i++) freq[i]=0;
        
        for(int i=0; i<s.length(); i++) freq[s.charAt(i)]++;
        
        for(int i=0; i<256; i++){
            if(freq[i]!=0) System.out.print(((char)i) + " : " + freq[i] + "\n");
        }
    }
}