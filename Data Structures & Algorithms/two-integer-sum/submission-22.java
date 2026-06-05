class Solution {
    public int[] twoSum(int[] nums, int target) {
        var result = new ArrayList<Integer>();
        for(int i = 0; i< nums.length; i++){
            for(int j= 0; j<nums.length;j++){
                if(i == j){
                    continue;
                }
                if(nums[i] + nums[j] == target){
                    result.add(i);
                    result.add(j);
                    // break;
                }
            }
        }
        // int[] resArr = new int[2];
        return new int[]{result.get(0), result.get(1)};
        // return new int[]{0,1};
    }
}
