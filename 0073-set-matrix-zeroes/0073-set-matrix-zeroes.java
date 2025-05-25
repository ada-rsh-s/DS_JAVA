class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> i_set = new HashSet<>();
        Set<Integer> j_set = new HashSet<>();
        
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                {
                    i_set.add(i);
                    j_set.add(j);
                }
            }
        }

        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i_set.contains(i) || j_set.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}