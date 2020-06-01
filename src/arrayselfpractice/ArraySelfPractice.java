/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayselfpractice;

import java.util.Arrays;

/**
 *
 * @author Peter
 */
public class ArraySelfPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*   1-Dimensional Arrays
        
        String[] flavours = new String[4];
        
        flavours[0] = "chocolate";
        flavours[1] = "banana";
        flavours[2] = "orange";
        flavours[3] = "vanilla";
        
        
        for ( String each : flavours ){
            System.out.println(each);
        }
        
        int[] numberArray = new int[50];
        
        for ( int i = 0; i < 49; i++){
            numberArray[i]= i * 48;
            System.out.println(numberArray[i]);
        }
        */
        
        
        //  Two Dimensional Arrays
        
        double[][] studentGrades = {
            {87.5, 77.1, 75.0},
            {61.2, 67.3, 79.3},
            {92.8, 92.8, 97.7},
            {80.0, 75.9, 88.0}
        };
        
        int boardDim = 8;
        char[][] board = new char[boardDim][boardDim];
        boolean isWhite = false;
        for (int y = 0; y < board.length; y++) {
            isWhite = !isWhite;
            for (int x = 0; x < board[y].length; x++) {
                
                board[y][x] = isWhite ? 'W' : 'B';
                isWhite = !isWhite;
                System.out.print(board[y][x]);
                
            }
            System.out.println("");
        }

        board[0][0] = 'K';
        
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        
        System.out.print( board[4][3]);
        System.out.print( board[0][0]);
        
    }
    
}
