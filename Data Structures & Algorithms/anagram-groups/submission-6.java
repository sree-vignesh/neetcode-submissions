class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var map = new HashMap<String,ArrayList<String>>();

        for(var word : strs){
            var refArr = new int[26];
            for(var x : word.toCharArray()){
                refArr[x - 'a']++;
            }
            var key = Arrays.toString(refArr);
            map.computeIfAbsent(key, k -> new ArrayList<>())
              .add(word);
        }
              return new ArrayList<>(map.values());
        
    }
}

