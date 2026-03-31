/* Give the array, return the longest consecutive sequence where number of ones is greater than number of zeros by one */

class Ones_Zeros{
    static int[] ones_zeros2(int[] arr){
        int start=0;
        int end=0;
        int max=0;
                
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                int len = (j-i)+1;
                if(sum-(len-sum)==1){
                    if(len>max){
                        max=len;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        if(max==0) return new int[0];
        
        int[] ans = new int[max];
        int ptr=0;
        for(int i=start; i<=end; i++){
            ans[ptr++]=arr[i];
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,0,0,0,0};
        int ans[] = ones_zeros2(arr);
        System.out.println("Output: ");
        for(int i=0; i<ans.length; i++) System.out.print(ans[i]+" ");
        System.out.print("\n");
    }
}