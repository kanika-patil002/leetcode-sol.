class Solution {
    public String reverseStr(String s, int k) {

        char[] str = s.toCharArray();
        int n = str.length;

        for(int i = 0; i < n; i += 2 * k){

            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while(left < right){

                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;

                left++;
                right--;
            }
        }

        return new String(str);
    }
}