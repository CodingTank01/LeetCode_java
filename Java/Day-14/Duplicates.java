import java.util.HashSet;

class Main{
    public static void main(String[]args){
        int []nums={1,2,3,1,4,2};
        HashSet<Integer> set=new HashSet<>();
        boolean flag=false;
        for(int x:nums){
            if(!set.add(x)){ 
                flag=true;
                break;
            }
        }
        System.out.println(flag);
    }
}