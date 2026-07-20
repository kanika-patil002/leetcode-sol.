class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int x = grid.length;
        int y = grid[0].length;
        int total = x * y ;

        int[] matrix = new int[total];
        for(int i = 0 ; i < x ; i++){
            for(int j = 0 ; j < y ; j++){
                matrix[i * y + j ] = grid[i][j];
            }
        }

        k = k % total ; 

        int[] shifted = new int[total];

        for(int i = 0 ; i < total ; i++){
            shifted[(i + k) % total] = matrix[i];
        }
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0 ; 
        for(int i = 0 ; i < x ; i++){
            List<Integer> row = new ArrayList<>();

            for(int j = 0 ; j < y ; j++){
                row.add(shifted[index]);
                index++;
            }
            ans.add(row);
        }
        return ans;


    }
}