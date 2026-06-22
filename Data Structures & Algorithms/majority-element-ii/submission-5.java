class Solution {
    public List<Integer> majorityElement(int[] nums) {
        var result = new ArrayList<Integer>();
        var map = new HashMap<Integer,Integer>();
        int limit = nums.length /3;

        for(var x : nums){
            map.merge(x, 1, Integer::sum);
            if(map.get(x) > limit){
                if(!result.contains(x))
                result.add(x);
            }
        }
        return result;

    }
}