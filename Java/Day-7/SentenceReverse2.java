/* Reverse the order of words in a sentence */

public class SentenceReverse2{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        String out = wordRev2(str1);
        System.out.print("Output: " + out+"\n");

    }

    static String wordRev2(String s){
        String out = "";
        for(int i=0; i<s.length(); i++){
            String temp = "";
            while(i<s.length() && s.charAt(i)!=' '){
                temp=temp+s.charAt(i);
                i++;
            }
            temp=temp+" ";
            out=temp+out;
        }
        return out;
    }
}
