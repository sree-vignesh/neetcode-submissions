class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer,Integer>();
        var result = new HashSet<Integer>();
        for(var x : nums){
            map.merge(x, 1, Integer::sum);
            if(map.get(x) >= k){
                result.add(x);
            }
        }
        
        var arr = new int[result.size()];
        int i = 0;
        for(var x : result){
            arr[i] = x;
            i++;
        }
        return arr;
    }
}
