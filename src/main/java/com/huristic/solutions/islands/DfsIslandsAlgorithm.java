package com.huristic.solutions.islands;

import org.springframework.stereotype.Component;

/**
 * @author dkhanaferov
 * @since 10/30/16
 */
@Component("dfs")
public class DfsIslandsAlgorithm implements IslandsAlgorithm {

    private final int VISITED = 2;

    //define indexes of neighbors for fast lookup
    private final int[] columns = {-1, 0, 1, -1,1, -1,0,1};
    private final int[] rows =    {-1,-1,-1,0,0,1,1,1};

    public int findIslandsCount(int[][] matrix) {

        int numIslands = 0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j]!=VISITED && matrix[i][j] == 1) {
                    dfs(i,j, matrix);
                    numIslands++;
                }
                else {
                    matrix[i][j]=VISITED;
                }
            }
        }

        return numIslands;
    }

    private void dfs(int i, int j, int[][] matrix) {

        //Mark current cell as visited
        matrix[i][j] = VISITED;

        //iterate through each neighbors and if legal recursively call dfs
        for(int n=0; n<columns.length; n++) {

            int c = j+columns[n];
            int r = i+rows[n];

            if(isLegal(c, r, matrix)) {
                dfs(r, c, matrix);
            }
        }
    }

    private boolean isLegal(int c, int r, int[][] matrix) {
        return c>=0 && r>=0 && r<matrix.length && c<matrix[0].length && matrix[r][c]!=VISITED && matrix[r][c]==1;
    }
}
