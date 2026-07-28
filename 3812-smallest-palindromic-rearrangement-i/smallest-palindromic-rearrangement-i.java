class Solution {
    public String smallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        int i = 0 ; 
        while(i < arr.length){
            char ch = arr[i];
            int count = 0 ;
            while(i < arr.length && arr[i]==ch){
                count++;
                i++;
            }
            for(int j = 0 ; j < count / 2 ; j++){
                left.append(ch);
            }
            if(count % 2 == 1){
                middle.append(ch);
            }
        }
        String right = left.reverse().toString();
        left.reverse();
        return left.toString() + middle.toString() + right;
        
    }
}