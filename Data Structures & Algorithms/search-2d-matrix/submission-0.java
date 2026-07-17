class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left=0;
        int right=(matrix.length*matrix[0].length)-1;
        int cols=matrix[0].length;
        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/cols;
            int col=mid%cols;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
}
