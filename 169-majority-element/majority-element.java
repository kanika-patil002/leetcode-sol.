class Solution {
    public int majorityElement(int[] nums) {
        int Element = 0 ;
        int count = 0 ;
        for (int i = 0 ; i < nums.length ; i++){
            if(count==0){
                Element = nums[i];
            }
            if(nums[i]==Element){
                count++;
            }
            else{
                count--;
            }
        }
        return Element;
    }
}