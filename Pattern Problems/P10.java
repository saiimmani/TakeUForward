// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public void pattern(int n) {
    for(int i = 1; i <= n; i++){
    for(int j = 1; j <= i; j++){
        System.out.print("*");          
    }
    System.out.println();
}
    for(int i = n -1 ; i >= 1; i--){
    for(int j = 1; j <= i; j++){
        System.out.print("*");
    }
    System.out.println();
}
}
}

class P10 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.pattern(5);
    }
}

/*
  
*
**
***
****
*****
****
***
**
*

*/
