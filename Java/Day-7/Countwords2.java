/* Count Words in a String */

public class Countwords2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        int n = words3(str1);
        System.out.print("Count: "+n+"\n");
    }
    
    static int words3(String s){
        boolean flag=true;
        int count=0;
        for(int i=0; i<s.length()-1; i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                if(flag){
                    flag=false;
                    count++;
                }
            }
            else flag=true;
        }
        
        return count;
    }
}