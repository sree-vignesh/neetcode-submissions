class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        var result = new ArrayList<Integer>();
        
        for (var x : nums) {
            map.merge(x, 1, Integer::sum);
        }
        var bucket = new ArrayList<ArrayList<Integer>>(nums.length);

        for (var x : nums) {
            bucket.add(new ArrayList<>());
        }
        bucket.add(new ArrayList<>());

        for (var x : map.entrySet()) {
            bucket.get(x.getValue()).add(x.getKey());
        }
        for (var x : bucket.reversed()) {
            if(x.size() > 0 ){
                result.addAll(x);
            }
        }
        
        System.out.println(result);
        // int[] resArr = new int[result.size()];
        

return result.subList(0, k).stream().mapToInt(Integer::intValue).toArray();
        // return result.toArray();
    }
}
