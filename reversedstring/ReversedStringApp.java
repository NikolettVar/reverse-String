/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversedstring;

/**
 *ReversedStringApp.java
 *N Varadi
 *09 03 2021
 */

public class ReversedStringApp {//reverse a string

    /**
     * @param str
     * @return 
     */
    
    public static String reverseString(String str){
        if(str.length() == 0){//if string is empty
            return str; //base case
        }
        else{
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str = "tesla";
        String reversed = reverseString(str);
        System.out.println("The word is: " + str+ ", the reversed word is: " + reversed);
    }
    
}
