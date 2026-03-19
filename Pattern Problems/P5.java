// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public void pattern1(int n) {
        for (int i = n; i>=1; i--){   // Here we are decrementing value of 'i' in each case
            for (int j = 1; j <= i; j++){  // Dry Run -> 1st Loop of 'i' 
              // i = 5  j= 1 , here it increment value of 'j' * -> 1st Time , **-> after second Loop Similarly runs until case fails final --> prints *****, in next loop for n = 4 as follows 👇
                System.out.print('*');
            }
            System.out.println();
        }

    }
}

class P5 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern1(5);
    }
}

/*

*****   --- > i = 5 
****         --> i = 4
***          --> i = 3
**            --> i =  2
*      ---> i = 1
  
*/
