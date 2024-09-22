public class MaxSubArraySum {
    public static void main(String[] args) {
        MaxSubArraySumSolution msass = new MaxSubArraySumSolution();
        int[]test =  {-4,-5};
        System.out.println(msass.maxSubArray(test));
    }
}

class MaxSubArraySumSolution{
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;
        // [-2,1,-3,4,-1,2,1,-5,4]
        for(int i=0;i<nums.length;i++){
            currSum+= nums[i];
            if (currSum >= 0) {
                maxSum  = Math.max(maxSum, currSum);
            }else{
                maxSum = Math.max(maxSum, currSum);
                currSum = 0;
            }
        }
        return maxSum;
    }
}