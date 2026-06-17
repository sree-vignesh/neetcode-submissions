class Solution {
    public int majorityElement(int[] nums) {
        var map = new HashMap<Integer,Integer>();
        int max = nums[0];
        int f = 0;

        for(var x : nums){
            map.merge(x,1,Integer::sum);
            if(map.get(x) > f){
                f = map.get(x);
                max =x;
            }

        }
        return max;
    }
}