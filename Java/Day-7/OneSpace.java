/* Ensure all words are separated by a single space */

public class OneSpace{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        String out = oneSpace(str1);
        System.out.print("Output: " + out+"\n");

    }

    static String oneSpace(String s){
        String out="";
        boolean flag=false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                out=out+ch;
                flag=true;
            }
            else if(flag){
                out=out+ch;
                flag=false;
            }
        }
        return out;
    }
}