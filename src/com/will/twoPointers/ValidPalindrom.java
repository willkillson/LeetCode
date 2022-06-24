package com.will.twoPointers;


class ValidPalindrom {

    public boolean isPalindrome(String s) {

        // convert all uppercase into lower
        // strip out all
        s = s.toLowerCase();
        int b = 0;
        int e = s.length()-1;

        while(b<e){
            // Pass over non-alphanumeric
            if(!Character.isLetterOrDigit(s.charAt(b))){
                b++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(e))){
                e--;
                continue;
            }
            // Check if alphanumeric characters are equal
            if(s.charAt(b)!=s.charAt(e)){
                return false;
            }
            b++;
            e--;
        }
        return true;

    }

    public static void main(String[] args) {
        new ValidPalindrom().isPalindrome("race a car");
    }
}
