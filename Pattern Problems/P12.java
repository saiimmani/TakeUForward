class Solution {
    public void pattern(int n) {
        int space = 2*(n-1);         // Multiple of two 
    for (int i = 1; i <= n; i++) {    // outer loop 
    for (int l = 1; l <=i; l++){      // This Print Right angled triangle 
        System.out.print(l);
    }
        
    for (int m = 1 ; m <= space; m++ ){
        System.out.print(" ");    // PRINTS spaces 6,4,2,0 respectively 
    }
    for (int j = i ; j >= 1; j--) {
        System.out.print(j);         // Prints Right Angled Triangle 
                
            }
            System.out.println();
            space-=2;                // Decrement the space by 2 --> space = space - 2
                     
        }
    }

}


class P12 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern(5);
    }
}

/*

1        1
12      21
123    321
1234  4321
1234554321


*/
