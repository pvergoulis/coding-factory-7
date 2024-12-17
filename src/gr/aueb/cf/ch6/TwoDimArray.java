package gr.aueb.cf.ch6;

public class TwoDimArray {

    public static void main(String[] args) {
        int [][] grid = new int [2][3];

        grid[0][0] = 5;
        grid[0][1] = 7;
        grid[0][2] = 10;
        grid[1][0] = 2;
        grid[1][1] = 6;
        grid[1][2] = 8;

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        for (int[] row : grid) {
            for (int el : row){
                System.out.println();
            }
        }
    }
}
