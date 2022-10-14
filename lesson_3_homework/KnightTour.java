package lesson_3_homework;

import java.util.Arrays;

public class KnightTour {
    static int N = 5;

    static int[][] moves = {{1, 2}, {-1, 2}, {1, -2}, {-1, -2},
            {2, 1}, {-2, 1}, {2, -1}, {-2, -1}};

    public static void main(String[] args) {
        solveKT();
    }

    static boolean isSafe(int x, int y, int[][] sol) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    static void printSolution(int[][] sol) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++)
                System.out.printf("%02d ", sol[x][y]);
            System.out.println();
        }
    }

    static boolean solveKT() {
        int[][] board = new int[N][N];
        for (int[] row : board)
            Arrays.fill(row, -1);

        board[0][0] = 1;

        if (!solveKTUtil(0, 0, 1, board)) {
            System.out.println("Решения нет");
            return false;
        } else {
            printSolution(board);
        }
        return true;
    }

    static boolean solveKTUtil(int row, int col, int stepCount, int[][] board) {
        if (stepCount == N * N)
            return true;

        for (int k = 0; k < 8; k++) {
            int newRow = row + moves[k][0];
            int newCol = col + moves[k][1];
            if (isSafe(newRow, newCol, board)) {
                board[newRow][newCol] = stepCount + 1;
                if (solveKTUtil(newRow, newCol, stepCount + 1, board)) {
                    return true;
                }

                board[newRow][newCol] = -1;
            }
        }
        return false;
    }
}
