class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int num=1;
        for(int layer=0;layer<(n+1)/2;layer++){ 
            for(int i=layer;i<n-layer;i++){
                matrix[layer][i]=num++;
            }
            for(int i=layer+1;i<n-layer;i++){
                matrix[i][n-layer-1]=num++;
            }
            for(int i=n-layer-2;i>=layer;i--){
                if(n-layer-1 != layer){
                matrix[n-layer-1][i]=num++;
                }
            }
            for(int i=n-layer-2;i>layer;i--){
                if(n-layer-1 != layer){
                matrix[i][layer]=num++;
                }
            }
        }
        return matrix;
    }  
}