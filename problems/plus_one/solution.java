class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        while (index >= 0) {
            if (digits[index] != 9) {
                digits[index]++;
                break;
            } else {
                if (index == 0) {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    return result;
                }
                digits[index] = 0;
                index--;
            }
        }
        return digits;
    }
 
}