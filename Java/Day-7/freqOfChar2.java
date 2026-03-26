/* Count the frequency of each character in a string without using additional data structures  */

public class freqOfChar2{
    
    public static void main{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        freq2(str1);
    }

    static void freq2(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            boolean flag=false;
            for(int j=0; j<i; j++){
                if(s.charAt(j)==ch){
                    flag=true;
                    break;
                }
            }
            
            if(flag) continue;
            
            int count=1;
            for(int k=i+1; k<s.length(); k++) {
                if(s.charAt(k)==ch) count++;
            }
            
            if(ch==' ') System.out.println("_"+" : "+count);
            else System.out.println(ch+" : "+count);
        }
    }
}