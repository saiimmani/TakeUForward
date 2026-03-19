// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public void pattern(int n) {
       for (int i = 1; i<=n ; i++){ // Top Pyramid
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");    // in loop 1 -> It Prints 4 Spaces  ( 3 , 2,1 respectively)
            }
            for (int m = 1; m <= (2*i-1); m++){
                System.out.print("*");  // in loop 1 -> it print 1 star , 2nd Loop 3 Stars (Odd Stars) 5, 7 , 9
            }
            System.out.println();
        }

        for (int i = n; i>=1 ; i--){  // Inverse of Top Pyramid
            
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");    
            }
            for (int m = 1; m <= (2*i-1); m++){
            System.out.print("*");  
            }
            
        System.out.println();
        }

  }
 
  }

class P9 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern(5);
    }
}


/* Output
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/
