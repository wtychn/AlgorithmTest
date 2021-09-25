package com.algorithm.array;

import com.sun.org.glassfish.gmbal.Description;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * @Description: 有效的数独
 * @level mid
 * @author wtychn
 * @Date 2021/9/17
 */
public class LC_36_IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> sudokus = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            sudokus.add(new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> column = new HashSet<>();
            Set<Character> row = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int sudokuIdx = (i / 3) * 3 + (j / 3);
                    if (row.contains(board[i][j]) ||
                            sudokus.get(sudokuIdx).contains(board[i][j]))
                        return false;
                    row.add(board[i][j]);
                    sudokus.get(sudokuIdx).add(board[i][j]);
                }
                if (board[j][i] != '.') {
                    if (column.contains(board[j][i]))
                        return false;
                    column.add(board[j][i]);
                }
            }
        }

        return true;
    }
}
