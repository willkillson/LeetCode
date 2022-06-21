package com.will.arraysAndHashing;


//https://leetcode.com/problems/valid-anagram/submissions/
class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0;i< s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i = 0;i< count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}

/* // log(n)

        if(s.length()!= t.length()){
            return false;
        }
        
        int[] count = new int[26];
        
        for(int i = 0;i< s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for(int n:count){
            if(n!=0){
                return false;
            }
        }
        return true;

*/

/*  //nlog(n) because of sort

        if(s.length()!=t.length()){
            return false;
        }
        char[] as = s.toCharArray();
        char[] at = t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(at);
        for(int i = 0;i< s.length();i++){
            if(as[i]!=at[i]){
                return false;
            }
        }
        return true;
*/