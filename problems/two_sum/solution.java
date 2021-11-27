class Solution {
    public int[] twoSum(int[] nums, int target) {
        
  int[] array = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            
            int currentNumber = nums[i];
            int incrementer = 1; 
            
           while(incrementer < nums.length){
               
              int number = nums[incrementer];
               
               if((currentNumber + number) == target && incrementer != i){
                   array[0] = i;
                   array[1] = incrementer; 
               }
               
               incrementer++;
           }
            
        }
        return array; 
    }
}