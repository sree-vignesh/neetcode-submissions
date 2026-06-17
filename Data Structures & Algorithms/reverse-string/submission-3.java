class Solution {
    public void reverseString(char[] s) {
        int pointer1 = 0;
        int pointer2 = s.length-1;
        char temp;

        int limit = s.length /2;
        // limit--;

        while(pointer1 < limit){
            temp = s[pointer1];
            s[pointer1] = s[pointer2];
            s[pointer2] = temp;
            pointer1++;
            pointer2--;
        }
    }
}