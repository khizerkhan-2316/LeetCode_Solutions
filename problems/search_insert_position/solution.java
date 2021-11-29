class Solution {
    public int searchInsert(int[] nums, int target) {
        
        ;
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == target){
                return i;
            } else if(target < nums[i] && i < nums.length) {
                return (i);
            }
            
            
        }
        
        return nums.length;
        
    }
}