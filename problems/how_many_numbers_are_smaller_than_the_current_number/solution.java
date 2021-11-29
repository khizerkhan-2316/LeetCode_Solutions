class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] result = new int[nums.length];
        
        int counter = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            int currentNumber = nums[i];
            int j = 0;
            while(j < nums.length){
                
                if(currentNumber > nums[j]){
                counter++;
                }
                j++;
            }
            
            result[i] = counter;
            counter = 0;
        }
        
        return result;
    }
}