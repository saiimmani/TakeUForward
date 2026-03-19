// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Solution {
    public void pattern1(int n) {
        for (int i = 1; i<=n; i++){ // Here "i" represents rows , outer loop waits for inner loop to run and increments its value and move to i+1 i.e 2 row 
            for (int j = 1; j<=n; j++){ // Here 'j' represents cols, it complete all five iterations and print '*' in five cols -> *****.
                System.out.print("*");
            }// complete the inner loop
            System.out.println();
        } // comple=te outer loop

    } // end of method 
} // end of class

class P1 {
    public static void main(String[] args) { // Main Function
        Solution sol = new Solution(); // Create obj to class the method 
        sol.pattern1(5); // assign 5 as input to method
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


  
