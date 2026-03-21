class Solution {
    public void pattern(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.pattern(4);
    }
}

/*

****
*  *
*  *
****
*/
