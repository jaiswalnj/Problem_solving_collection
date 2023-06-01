import java.util.*;

class Solution {
    int ROW, COL;
    public int shortestPathBinaryMatrix(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;

        boolean[][] visited = new boolean[ROW][COL];
        
        if (grid[0][0] != 0 || grid[ROW - 1][COL - 1] != 0) {
            return -1;
        }

        Queue<int[]> q = new ArrayDeque<>();
        int[][] dirs = new int[][]{{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1},{0,1},{1,1}};
        q.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int row = cur[0];
            int col = cur[1];
            int distance = cur[2];
            if(row == ROW-1 && col == COL-1) {
                return distance;
            }
            for(int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if(isBound(newRow, newCol) && !visited[newRow][newCol] && grid[newRow][newCol] == 0) {
                    q.offer(new int[]{newRow, newCol, distance + 1});           
                    visited[newRow][newCol] = true;
                }
            }
        }
        return -1;
    }
    public boolean isBound(int row, int col){
        return row>=0 && row<ROW && col>=0 && col<COL;
    }
}