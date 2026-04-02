class Solution {
    public int gcd(int a, int b){
        if(a==0||b==0){
            return Math.max(a,b);
        }
        if(a==b){
            return a;
        }

        if(a>b){
            return gcd(a-b,b);
        }
        return gcd(a,b-a);
    }
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int x:nums){
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
        }
        return gcd(max, min);
        
    }
}