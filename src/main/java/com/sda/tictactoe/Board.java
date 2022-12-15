package com.sda.tictactoe;

public class Board {
    private char[][] board = {{' ',' ', ' '},{' ',' ', ' '},{' ',' ', ' '}};

    public boolean hasWon(char player){
        // player 'x' and 'y'
        return false;
    }
    public boolean makeMove(int row, int column, char player){
        // also, check if the move is valid, it means two things:
        //no one has placed the symbol there,
        // and row and column index is not out of bounds
        // if move cannot be done, return false
        return false;
    }
}
