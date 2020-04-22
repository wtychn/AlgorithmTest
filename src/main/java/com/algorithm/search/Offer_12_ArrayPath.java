package com.algorithm.search;

import java.util.HashMap;
import java.util.Map;

public class Offer_12_ArrayPath {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null) {
            return false;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(searchNext(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean searchNext(char[][] board, String word, int row, int column, int index) {
        if (row >= board.length || row < 0
                || column >= board[0].length || column < 0
                || board[row][column] != word.charAt(index))
            return false;
        if (index == word.length() - 1) return true;
        char tmp = board[row][column];
        board[row][column] = '/';
        boolean res = searchNext(board, word, row + 1, column, index + 1)
                || searchNext(board, word, row - 1, column, index + 1)
                || searchNext(board, word, row, column + 1, index + 1)
                || searchNext(board, word, row, column - 1, index + 1);
        board[row][column] = tmp;
        return res;
    }
}
