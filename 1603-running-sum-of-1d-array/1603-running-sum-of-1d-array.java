class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] result = new int[n];
        int ans=0;
        for(int i=0 ; i<n;i++){
            ans=ans+nums[i];
            result[i] = ans;
        }
        return result;
    }
}