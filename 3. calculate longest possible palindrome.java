// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, it was a straightforward problem


// Your code here along with comments explaining your approach in three sentences only

class Solution {
    public int longestPalindrome(String s) { 
        //Approach with HashSet
        int count = 0;
        boolean flag = false;
        HashSet<Character> set = new HashSet<>();

        for(char c: s.toCharArray()){
            if (set.contains(c)){
                count += 2;
                set.remove(c);
            }
            else{
                set.add(c);
            }
        }

        if(set.size() > 0) return count+1;
        return count;

    }
}
