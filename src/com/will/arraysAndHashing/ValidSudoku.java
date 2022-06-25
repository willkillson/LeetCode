package com.will.arraysAndHashing;


import java.util.HashSet;

class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        //check rows
        for(int i = 0;i< board.length;i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j = 0;j< board[0].length;j++){
                Character c = board[i][j];
                if(hs.contains(c) && c!='.'){
                    return false;
                }else{
                    hs.add(c);
                }
            }
        }

        //check columns
        for(int i = 0;i< board.length;i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j = 0;j< board[0].length;j++){
                Character c = board[j][i];
                if(hs.contains(c) && c!='.'){
                    return false;
                }else{
                    hs.add(c);
                }
            }
        }

        //check 9x9 squares
        for(int i = 0;i< 3;i++){
            for(int j = 0;j< 3;j++){

                int x = 1 + (3*i);
                int y = 1 + (3*j);
                //the 9x9
                HashSet<Character> hs = new HashSet<>();
                for(int k = -1;k<=1;k++){
                    for(int l = -1;l<=1;l++){
                        Character c = board[x+k][y+l];
                        if(hs.contains(c) && c!='.'){
                            return false;
                        }else{
                            hs.add(c);
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
