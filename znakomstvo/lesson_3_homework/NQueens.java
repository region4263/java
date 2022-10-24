package lesson_3_homework;

import java.util.ArrayList;
import java.util.List;

class NQueens {
    List<List<String>> ans = new ArrayList<>();
    char[][] board;

    public List<List<String>> solveNQueens(int n) {
        init(n);

        backtrack(0, n);
        return ans;
    }

    boolean backtrack(int col, int n) {
        if (col == n) {
            addBoard();
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 'Q';
                backtrack(col + 1, n);
                board[i][col] = '.';
            }
        }
        return false;
    }

    boolean isSafe(int r, int c) {
        for (int i = 0; i < c; i++) {
            if (board[r][i] == 'Q') return false;
        }

        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = r + 1, j = c - 1; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private void addBoard() {
        List<String> newBoard = new ArrayList<>();

        for (char[] chars : board) {
            newBoard.add(new String(chars));
        }
        ans.add(newBoard);
    }

    private void init(int n) {
        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            for (int j = 0; j < n; j++) {
                row[j] = '.';
            }
            board[i] = row;
        }
    }
}