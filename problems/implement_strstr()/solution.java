class Solution {
    public int strStr(String haystack, String needle) {
        
        return needle.length() == 0? 0 : haystack.contains(needle)? haystack.indexOf(needle) : -1;
        
    }
}