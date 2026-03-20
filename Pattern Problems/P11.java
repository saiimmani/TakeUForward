class Solution {
    public void pattern(int n) {
    for (int i = 1; i <= n; i++) {

            int start;
            if (i % 2 == 0) {
                start = 0;         // for even rows start with 0
            } else {
                start = 1;          // for odd rows start with 1
            }

            for (int j = 1; j <= i; j++) {       // logic to print right angle triangle
                System.out.print(start + " ");
                start = 1 - start; // flip between 1 and 0 
            }

            System.out.println();
        }
    }

}


class P11 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern(5);
    }
}

/*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/













