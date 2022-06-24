package com.will.arraysAndHashing;


import java.util.HashSet;

class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        //check rows
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0;i< board.length;i++){
            hs = new HashSet<>();
            for(int j = 0;j< board[0].length;j++){
                if(hs.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }else{
                    hs.add(board[i][j]);
                }
            }
        }

        //check columns
        for(int i = 0;i< board.length;i++){
            hs = new HashSet<>();
            for(int j = 0;j< board[0].length;j++){
                if(hs.contains(board[j][i]) && board[j][i]!='.'){
                    return false;
                }else{
                    hs.add(board[j][i]);
                }
            }
        }

        // top
        // 1,1
        // 1,4
        // 1,7

        //mid
        // 4,1
        // 4,4
        // 4,7

        //bot
        // 7, 1
        // 7, 4
        // 7,7
        //check 9 3x3's


        for(int i = 0;i< 3;i++){
            for(int j = 0;j< 3;j++){
                hs = new HashSet<>();
                int x = 1 + (i)*3;
                int y = 1 + (j)*3;
                for(int k =-1;k<= 1;k++){
                    for(int l = -1;l<=1;l++){
                        if(hs.contains(board[x+k][y+l]) && board[x+k][y+l]!='.'){
                            return false;
                        }else{
                            hs.add(board[x+k][y+l]);
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashSet<Character> hs = new HashSet<>();


        // rows x columns
        // 5 x 10
        char[][] board = new char[][]{
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        //rows
        System.out.println("board.length: " +board.length);
        //columns
        System.out.println("board[0].length: " +board[0].length);

        new ValidSudoku().isValidSudoku(board);
    }
}
