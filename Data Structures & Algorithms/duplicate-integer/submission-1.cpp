class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        set<int> st;
        for(int a : nums){
            if(st.find(a)!=st.end()){
                return true;
            }
            else{
                st.insert(a);
            }
        }
        return false;
    }
};