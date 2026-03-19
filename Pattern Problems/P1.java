// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Solution {
    public void pattern1(int n) {
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

class P1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern1(5);
    }
}

/* 
Output 👇

*****
*****
*****
*****
*****
  
*/


  
