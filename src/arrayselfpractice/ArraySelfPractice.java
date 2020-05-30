/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayselfpractice;

/**
 *
 * @author Peter
 */
public class ArraySelfPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        
    }
    
}
