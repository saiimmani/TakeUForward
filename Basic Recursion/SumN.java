class Solution {
    // Recursive function to find sum of first N natural numbers
    public int sumOfNaturalNumbers(int N) {
        // Base case: if N is 1, return 1
        if (N == 1) {
            return 1;
        }
        // Recursive case: current number + sum of previous numbers
        return N + sumOfNaturalNumbers(N - 1); 
      // return (N*(n+1)/2); --> direct math formula
      // int sum = 0;
      // for (int i = 1; i<= N; i++){
      //    sum += i;
      // }
      // return sum;
      
    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(obj.sumOfNaturalNumbers(N));
        sc.close();
    }
}
