class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int current_sum=0;

        for(int num:nums){
            
            if(current_sum<0){
                current_sum=0;
            }

            current_sum+=num;
            max=Math.max(max,current_sum);
        }
        return max;
    }
}
