class Solution {
    public int rob(int[] nums) {
    if(nums.length == 1)      return nums[0];
    if(nums.length  == 2)     return Math.max(nums[0], nums[1]);

    int[] HouseProfitTracker       = new int[nums.length];
    HouseProfitTracker[0]          = nums[0];
    HouseProfitTracker[1]          = Math.max(nums[0], nums[1]);
    
    for(int i = 2 ; i< nums.length ; ++i){
        HouseProfitTracker[i]    =Math.max(nums[i] + HouseProfitTracker
        [i-2], HouseProfitTracker[i-1]);
    }
    return HouseProfitTracker[nums.length-1];
    }
}