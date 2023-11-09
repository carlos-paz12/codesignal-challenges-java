package com.github.carlos_paz12.codesignal.check_palindrome;

public class CheckPalindrome {

    /*
     * Given the string, check if it is a palindrome.
     */
    boolean solution(String inputString) {
        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }

}
