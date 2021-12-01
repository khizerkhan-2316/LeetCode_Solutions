class Solution {
    public int missingNumber(int[] nums) {
        
      
       Arrays.sort(nums);
        
          if(nums[0] == 1){
            return 0;
        }
        
        
              
        for(int i = 0; i < nums.length; i++){
            
            int currentNumber = nums[i]; 
            
            
            if(i + 1 < nums.length){
                
                if(!(nums[i + 1] == currentNumber + 1)){
                    
                    return currentNumber + 1;
                } 
            } else if(i == nums.length - 1){
                return currentNumber + 1;
            }
        }
        
       
        return 1;
        
    }
}