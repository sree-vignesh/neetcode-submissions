class Solution {
    public int removeElement(int[] nums, int val) {
        int k =0;

        for(var x : nums){
             if (x != val) {
                nums[k] = x;
                k++;
            }
        }
        return k;
    }
}