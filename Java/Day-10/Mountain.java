class Mountain{
    static int[] mountain2(int[] arr){
        int start=0, end=0, max=2;
        int n=arr.length;
        
        for(int i=1; i<n-1; i++){
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                int l=i;
                while(l>0 && arr[l-1]<arr[l]) l--;
                
                int r=i;
                while(r<n-1 && arr[r+1]<arr[r]) r++;
                
                int len=r-l+1;
                if(len>max){
                    max=len;
                    start=l;
                    end=r;
                }
            }
            
            int rem = n - i - 1;
            if(rem<=max) break;
        }
        if(max==2) return new int[0];

        int[] ans = new int[end-start+1];
        int ptr=0;
        for(int i=start; i<=end; i++) ans[ptr++]=arr[i];

        return ans;        
        
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,6,5};
        int ans[] = mountain2(arr);
        System.out.println("Output: ");
        for(int i=0; i<ans.length; i++) System.out.print(ans[i]+" ");
        System.out.print("\n");
    }
}