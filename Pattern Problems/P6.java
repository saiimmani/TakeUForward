// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public void pattern1(int n) {
        for (int i = n; i>=1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j);          // same patter just printing j in this case as 👇
            }
            System.out.println();
        }

    }
}

class P6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern1(5);
    }
}

/* 
12345
1234
123
12
1
*/ 
