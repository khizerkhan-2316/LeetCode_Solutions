class Solution {
    public int lengthOfLastWord(String s) {
        
        int counter = 0;
        
        
        
        String[] characters = s.split("");
        
        for(int i = characters.length - 1; i >= 0; i--){
                
            while(!characters[i].equals(" ")){
                
                counter++;
               
                 if(!((i - 1) < 0)){
                     i--;
                 } else {
                     break;
                 }
            }
            
          if(counter > 0 || i == 0){
              break;
          }
        }
        
        return counter;
    }
}