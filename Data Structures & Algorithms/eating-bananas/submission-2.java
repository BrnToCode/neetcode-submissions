class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);

        while(low<high){
            int k=low+(high-low)/2;
            int hours=0;
            for(int num:piles){
                hours+=(num+k-1)/k;
            }
            if(hours<=h){
                high=k;
            }else{
                low=k+1;
            }
        }
        return high;
    }

    public static int max(int[] piles){
        int maxi=Integer.MIN_VALUE;
        for(int num:piles){
            maxi=Math.max(maxi,num);
        }
        return maxi;
    }
}
