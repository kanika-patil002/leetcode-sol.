class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        HashMap<Integer , Integer> hash = new HashMap<>();
        int rank = 1;
        for(int i = 0 ; i < copy.length ; i++){
            if(!hash.containsKey(copy[i])){
                hash.put(copy[i],rank);
                rank++;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = hash.get(arr[i]);
        }
        return arr;

    }
}