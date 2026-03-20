class Solution {
    public void pattern(int n) {
    for (int i=0 ; i<n; i++){
        char ch = (char) ('A' + i);
        for (int j = 0; j<=i; j++){
            System.out.print(ch);
        }
         System.out.println();
    }

 }
}

class P16 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern(5);
    }
}

/*

A
BB
CCC
DDDD
EEEEE

*/
