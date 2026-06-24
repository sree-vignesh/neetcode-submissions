class Solution {
    public boolean isPalindrome(String s) {
        var arr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        System.out.println(arr);
        int p1 = 0;
        int p2= arr.length -1;
        while(p1<p2){
            if(arr[p1]!=arr[p2]){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
