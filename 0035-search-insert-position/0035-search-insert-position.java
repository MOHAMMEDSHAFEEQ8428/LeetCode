class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;

        if(len == 0){
            return 1;
        }else if (nums[len - 1] < target){
            return len;
        }
        
        for(int i = 0; i < len; i++){
            int current = nums[i];
            if(current == target || target < current){
                return i;
            }else if ((current < target) && (nums[i + 1] > target)){
                return i + 1;
            }
        }
        return - 1;
    }
}