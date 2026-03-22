// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Solution {
    public static boolean isArmstrong(int num) {
        if (num < 0) return false; // optional safety

        int original = num;

        // Step 1: Count digits (without converting to String)
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Calculate Armstrong sum
        int sum = 0;
        temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            // Efficient power calculation (no Math.pow)
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        // Step 3: Compare
        return sum == original;
    }
}
class Main {
    public static void main(String[] args) {
         int num = 153;
        Solution obj = new Solution();
        // Use class method to check
        if (obj.isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
