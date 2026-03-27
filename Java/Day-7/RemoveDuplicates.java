/* Remove all Duplicates from the given string */
import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        String out = NoDuplicates(str1);
        System.out.print("Output: " + out+"\n");
    }
    
    static String NoDuplicates(String s){
        String res = "";
        for(int i=0; i<s.length(); i++){
            boolean flag=false;
            char ch = s.charAt(i);
            for(int j=0; j<res.length(); j++){
                if(res.charAt(j)==ch){
                    flag=true;
                    break;
                }
            }
            if(!flag) res=res+ch;
        }
        
        return res;
    }
}