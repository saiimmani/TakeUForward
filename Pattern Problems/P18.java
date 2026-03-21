class Solution {
    public void pattern(int n) {
    for (int i=0 ; i<n; i++){
    for (char ch = (char)('E'- i); ch <= 'E'; ch++){
         System.out.print(ch+" ");
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
E 
D E 
C D E 
B C D E 
A B C D E 

*/
