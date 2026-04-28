class Solution {

    public int maxSubArray(int[] nums) {
        
  /*  //Brute Force approach:- Time Complexity - O(n)
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int subSum = 0;
            for(int j = i ; j < nums.length; j++){
                subSum += nums[j];
                if(subSum > sum){
                    sum = subSum;
                }
            }
        }
        return sum;*/
    int finalMax = nums[0];
    int currMax = nums[0];
    for(int i = 1; i < nums.length; i++){
        currMax = Math.max(nums[i], currMax + nums[i]);
        finalMax = Math.max(currMax, finalMax); 
    }
    
    return finalMax;

    }
}
