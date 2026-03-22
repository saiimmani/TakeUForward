class Solution {
    public boolean isArmstrong(int n) {
        int k = String.valueOf(n).length();
        int copy = n;
        int num = n;
        int sum = 0;

        while( num > 0){
            int ld = num % 10;
            sum += Math.pow(ld,k);
            num /= 10;
        }

        return sum == copy;
    }
}
