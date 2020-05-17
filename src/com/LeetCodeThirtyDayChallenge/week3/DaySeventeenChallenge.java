package com.LeetCodeThirtyDayChallenge.week3;

public class DaySeventeenChallenge {
    public int numIslands(char[][] grid) {
        int rows = grid.length;

        if (rows == 0) return 0;

        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r == 0 && c != 0) grid[r][c] += grid[r][c - 1]; // for First Row
                else if (r != 0 && c == 0) grid[r][c] += grid[r - 1][c]; // for First Column
                else if (r != 0 && c != 0)
                    grid[r][c] += Math.min(grid[r][c - 1], grid[r - 1][c]); //for Rest of the elements, adds the minimum from the element at top and element at left
            }
        }
        return grid[rows - 1][cols - 1];
    }
}
