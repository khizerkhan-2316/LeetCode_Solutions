class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length < nums1.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        return findMedianSortedArrays(nums1, nums2, 0, nums1.length);
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2, int start, int end){
        if(start > end) return -1;
        int partition1 = (start + end) / 2;
        int partition2 = (nums1.length + nums2.length + 1) / 2 - partition1;
        
        int maxInLeftPartition1 = getMaxLeft(nums1, partition1);
        int minInRightPartition1 = getMinRight(nums1, partition1);
        int maxInLeftPartition2 = getMaxLeft(nums2, partition2);
        int minInRightPartition2 = getMinRight(nums2, partition2);
        
        if(maxInLeftPartition1 <= minInRightPartition2 && maxInLeftPartition2 <= minInRightPartition1){
            return getMedian(nums1, nums2, maxInLeftPartition1, maxInLeftPartition2, minInRightPartition1, minInRightPartition2);
        }  
        else if(maxInLeftPartition1 > minInRightPartition2){
            return findMedianSortedArrays(nums1, nums2, start, partition1 - 1);
        } 
        else{
            return findMedianSortedArrays(nums1, nums2, partition1 + 1, end);
        }
    }
    
    public int getMaxLeft(int[] nums, int partition){
        if(partition == 0) return Integer.MIN_VALUE;
        return nums[partition - 1];
    }
    
    public int getMinRight(int[] nums, int partition){
        if(partition == nums.length) return Integer.MAX_VALUE;
        return nums[partition];
    }
    
    public double getMedian(int[] nums1, int[] nums2, int maxInLeftPartition1, int maxInLeftPartition2, int minInRightPartition1, int minInRightPartition2){
        if((nums1.length + nums2.length) % 2 == 1){
            return (double) Math.max(maxInLeftPartition1, maxInLeftPartition2);
        }
        return ((double)(Math.max(maxInLeftPartition1, maxInLeftPartition2) + Math.min(minInRightPartition1, minInRightPartition2))) / 2; 
    }
}