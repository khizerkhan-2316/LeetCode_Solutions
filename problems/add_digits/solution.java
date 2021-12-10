class Solution {
    public int addDigits(int num) {
        
 String s = Integer.toString(num);
        if(s.length() == 1)
            return num;
        int sum = 0;
        while(num > 0)
        {
            sum = num % 10 + sum;
            num /= 10;
        }
        return addDigits(sum);

    }
}