package Backtracking;

import java.util.*;

class Solution {
    static List<List<String>> solveNQueens(int n)
    {
        String s = new String(new char[n]).replace("\0", ".");
        List<String> board = new ArrayList<>();
        List<List<String>> answer = new ArrayList<>();
        for (int i = 0; i < n; i++)
            board.add(s);
        rec(answer,board, 0);
        return answer;
    }

    static boolean safe(int row, int col, List<String> board) {
        for (int i = 0; i < board.size(); i++) {
            if (board.get(i).charAt(col) == 'Q')
                return false;
        }
        int i = row, j = col;
        while (i >= 0 && j >= 0)
            if (board.get(i--).charAt(j--) == 'Q')
                return false;
        i = row;
        j = col;
        while (i >= 0 && j < board.size())
            if (board.get(i--).charAt(j++) == 'Q')
                return false;
        return true;
    }

    static void rec(List<List<String>> answer,List<String> board, int row) {
        if (row == board.size()) {
            answer.add(board);
            return;
        }
        for (int i = 0; i < board.size(); i++)
        {
            if (safe(row, i, board)) {
                List<String> temp = new ArrayList<>(board);
                temp.set(row, temp.get(row).substring(0, i) + "Q" + temp.get(row).substring(i + 1));
                rec(answer,temp, row + 1);
            }
        }
        return;
    }
}