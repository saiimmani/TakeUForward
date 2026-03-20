class Solution {
    public void pattern(int n) {
    for (int i=n-1 ; i >=0; i--){  // Similar logic compared to previous problem
        for (char ch = 'A' ; ch <= 'A'+ i; ch++){  // different s
            System.out.print(ch+" ");
        }
         System.out.println();
    }

 }
}

class P15 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern(5);
    }
}

/*

A B C D E 
A B C D 
A B C 
A B 
A 

*/
