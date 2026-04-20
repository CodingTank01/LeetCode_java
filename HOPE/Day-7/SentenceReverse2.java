/* Reverse the order of words in a sentence */
import java.util.*;

public class SentenceReverse2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        String out = wordRev2(str1);
        System.out.print("Output: " + out+"\n");

        sc.close();

    }

    static String wordRev2(String s){
        String out = "", temp = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                temp=temp+s.charAt(i);
            }
            else{
                out=temp+" "+out;
                temp="";
            }
            
            if(i==s.length()-1) out=temp+" "+out;
        }
        return out;
    }
}
