class Solution {
    public void swap(int[]nums , int pos1 , int pos2 ){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp ;
    }

    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (mid <= end) {
            if (nums[mid] == 0) {
                swap(nums, mid, start);
                mid++;
                start++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, end);
                end--;

            }
        }
    }
}
