class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low = 1 ;
        int high = 0;
        int ans = 0 ;
        long total = 0 ;
        int n = candies.length;
        for(int i = 0 ; i < n  ; i++ ){
            total += candies[i];
            if(candies[i] > high){
                high = candies[i];
                
            }
        }
        if(total < k){
            return 0 ;
        }
        while(low<=high){
            int mid = low+(high-low) / 2;
            long count = 0 ;
            for(int i = 0 ; i < n ; i++){
                count+=candies[i] / mid ;
            }

            if(count >=k ){
                ans = mid;
                low = mid + 1 ;
            }
            else{
                high = mid -1;
            }
        }

        return ans;
    }
}