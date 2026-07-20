class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int low=0;
        int high=k-1;
        int n=nums.length;
        int max=0;
        int[] arr=new int[(n-k)+1];
        while(high<n){
            max=findMax(nums,low,high);
            arr[low]=max;
            low++;
            high++;
        }
        return arr;
    }

    public static int findMax(int[] arr,int start,int end){
        
        int maxi=Integer.MIN_VALUE;
        for(int i=start;i<=end;i++){
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}
