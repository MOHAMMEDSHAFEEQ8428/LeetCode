class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n*2];
        int track=0;
        for(int i=0 ;i<n*2 ; i++){
            if(track==n)track=0;
            ans[i]=nums[track++];
        }
        return ans;
    }
}