// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public void pattern(int n) {
      
            for (int i = n; i>=1 ; i--){   // i = 5 Main Logical Change comes here
            
            for (int j = 1; j <= n-i; j++){  
                System.out.print(" ");    // Dry Run -> 1st run -> O, 2nd Run -> 1 , 2, 3 , 4 Spaces Respectively 
            }
            for (int m = 1; m <= (2*i-1); m++){
                System.out.print("*");  // Print 9 stars in first run , One Space Follwes by 7, 5, 3 , 1 Respectively
            }
            
            System.out.println();
        }

    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern(5);
    }
}

/*

*********
 *******
  *****
   ***
    *
*/
