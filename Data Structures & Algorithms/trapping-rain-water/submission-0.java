class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int amt=0;
        int maxLeft=Integer.MIN_VALUE;
        int maxRight=Integer.MIN_VALUE;
        while(left<right){
            maxLeft=Math.max(maxLeft,height[left]);
            maxRight=Math.max(maxRight,height[right]);

            if(maxLeft<maxRight){
                amt+=maxLeft-height[left];
                left++;
            }else{
                amt+=maxRight-height[right];
                right--;
            }
        }
        return amt;
    }
}
