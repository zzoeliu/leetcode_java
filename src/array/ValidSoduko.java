package array;

/**
 * Created by ZoeLiu on 7/3/15.
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

 The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

 Design: we need to check each row, each column and each grid for non-duplicate numbers.
how to check the duplicate:
 we need to set another array with 9 boolean elements to record if the i number appeared or not.

 key point: You need to analyze the grid check
 grid 0~9
 i grid/3*3
 j grid%3*3
 */
public class ValidSoduko {
    public boolean isValidSudoku(char[][] board){

        //check rows
        for (int i=0;i<9;i++)
        {
            boolean[] test=new boolean[9];
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if((test[(int)(board[i][j]-'1')])==true)
                    {
                        return false;
                    }
                    test[(int)(board[i][j]-'1')]=true;
                }
            }
        }
        //check each column
        for (int j=0;j<9;j++)
        {
            boolean[] test=new boolean[9];
            for(int i=0;i<9;i++)
            {
                if(board[i][j]!='.')
                {
                    if((test[(int)(board[i][j]-'1')])==true)
                    {
                        return false;
                    }
                    test[(int)(board[i][j]-'1')]=true;
                }
            }
        }
        //check each grid,totally 9 grids
        //0 grid covers 0~2 rows ,0~2 columns; 1 grid covers 0~2 rows,3~5 columns;2 grid covers 0~2 rows,6~8 columns
        //grid 0,1,2 corresponding i=0,i=0,j corresponding 0,1,2;
        // covers 6~8 rows
        // and 0~2 columns, 1 grid covers
        for(int grid=0;grid<9;grid++) {
            for (int i = grid/3*3; i < grid/3*3+3; i ++) {
                boolean[] test = new boolean[9];
                for (int j = grid%3*3; j < grid%3*3 + 3; j++) {
                    if (board[i][j] != '.') {
                        if ((test[(int) (board[i][j] - '1')]) == true) {
                            return false;
                        }
                        test[(int) (board[i][j] - '1')] = true;
                    }
                }
            }
        }
        return true;
    }
}
