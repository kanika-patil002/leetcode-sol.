class Solution {
    public long gcdSum(int[] nums) {
        int [] prefixGcd = new int[nums.length];
        int max = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            prefixGcd[i] = gcd(max , nums[i]);
        }
        Arrays.sort(prefixGcd);
        int left = 0 ; 
        int right = nums.length - 1 ;
        long sum = 0 ;
        while(left<right){
            sum = sum + gcd(prefixGcd[left] , prefixGcd[right]);
            left++;
            right--;
        }
        return sum;
    }
    public int gcd(int a , int b){
        while(b != 0 ){
            int temp = b;
            b = a % b ; 
            a = temp ;
        }
        return a ;
    }
}