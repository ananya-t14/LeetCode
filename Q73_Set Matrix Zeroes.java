class Solution {
    public void setZeroes(int[][] matrix) {
        int M = matrix.length, N = matrix[0].length, i, j;
        boolean row[] = new boolean[M];
        boolean col[] = new boolean[N];
        for(i=0; i<M; i++)
            row[i] = false;
        for(j=0; j<N; j++)
            col[j] = false;
        for(i=0; i<M; i++){
            for(j=0; j<N; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(i=0; i<M; i++){
            for(j=0; j<N; j++){
                if(row[i] == true || col[j] == true)
                    matrix[i][j] = 0;
            }
        }
    }
}