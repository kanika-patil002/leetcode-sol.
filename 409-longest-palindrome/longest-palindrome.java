class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
       
        int count=0;
        Boolean odd=false;
        for(char ch : s.toCharArray())
        hash.put(ch, hash.getOrDefault(ch,0)+1 );
        for(int i : hash.values())
        {
            if(i%2==0)
            count+=i;
            else
            {
                count+=i-1;
                odd =true;
            }
        }
        if(odd)
        return ++count;
        else
        return count;
    }
}