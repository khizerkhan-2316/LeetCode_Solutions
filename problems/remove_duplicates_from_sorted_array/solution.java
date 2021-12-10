class Solution {
    public int removeDuplicates(int[] nums) {
        
     if(nums == null || nums.length == 0) {
            return 0;
        }
        int p = 0;
        int shift = 1;
        
        while(p + shift < nums.length) {
            if(nums[p + shift] != nums[p]) {
                nums[p+1] = nums[p+shift];
                p++;
                continue;
            }
            shift++;
        }
        
        return p+1;
    }
}