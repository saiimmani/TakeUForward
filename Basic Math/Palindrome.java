class Solution {
    public boolean isPalindrome(int x) {
       int rev = 0;
       int copy = x; // saving copy of the given integer
        while( x > 0){
        int digit = 0;
        digit = x%10;   // saves last digit 
        rev = rev*10 + digit;      // save reverse 
        x = x/10;   

       } 
        return rev == copy;
    }
}
