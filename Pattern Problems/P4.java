// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public void pattern1(int n) {
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}

class P4 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern1(5);
    }
}

/*

Output 👇  
1
22
333
4444
55555

*/
