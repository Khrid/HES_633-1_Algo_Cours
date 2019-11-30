public class TestSudoku {
    public static void main(String[] args) {
        int[][] matrice = {{0, 0, 4, 0, 0, 0, 5, 0, 0},
                {0, 0, 3, 2, 0, 6, 9, 0, 0},
                {6, 0, 0, 0, 5, 0, 0, 0, 3},
                {0, 4, 1, 7, 0, 9, 3, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 5, 6, 3, 0, 2, 8, 7, 0},
                {8, 0, 0, 0, 3, 0, 0, 0, 7},
                {0, 0, 2, 9, 0, 7, 1, 0, 0},
                {0, 0, 7, 0, 0, 0, 6, 0, 0}} ;

        int[][] matrice2 = {{9,0,0,1,0,0,0,0,5},
                {0,0,5,0,9,0,2,0,1},
                {8,0,0,0,4,0,0,0,0},
                {0,0,0,0,8,0,0,0,0},
                {0,0,0,7,0,0,0,0,0},
                {0,0,0,0,2,6,0,0,9},
                {2,0,0,3,0,0,0,0,6},
                {0,0,0,2,0,0,9,0,0},
                {0,0,1,9,0,4,5,7,0},
        } ;

        Sudoku s = new Sudoku();
        s.solve(matrice);
        s.solve(matrice2);
    }
}