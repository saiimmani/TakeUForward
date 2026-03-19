// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public void pattern1(int n) {
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j); // There we use 'j' to print the print 👇
            }
            System.out.println();
        }

    }
}

class P3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern1(5);
    }
}

/* 
output 👇

1          -> j = 1 , j < = 1 (i = 1 )     1           ( j -> col , i -> rows ) 
12            -> j = 1 , j < = 2 (i = 2 )  1 2 
123
1234
12345
*/ 
