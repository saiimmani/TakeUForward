class Solution {
    public void pattern(int n) {
    for (int i=0 ; i<n; i++){
        for (char ch = 'A' ; ch <= 'A'+ i; ch++){  // ASCI , we are incrementing the Character Same as Right Angled Triangle
            System.out.print(ch+" ");
        }
         System.out.println();
    }

 }
}

class P14 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern(5);
    }
}

/*
A 
A B 
A B C 
A B C D 
A B C D E 

*/
