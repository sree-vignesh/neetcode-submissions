class Solution {
    public int removeDuplicates(int[] nums) {
        var set = new LinkedHashSet<Integer>();

        for(var x : nums){
            set.add(x);
        }
        int i = 0;
        for(var x : set){
            nums[i]=x;
            i++;
        }
        return set.size();
    }
}