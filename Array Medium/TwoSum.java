class Solution {
    public int[] twoSum(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x = target - arr[i];
            if (map.containsKey(x)) {
                return new int[] { map.get(x), i };
            }
            map.put(arr[i], i);
        }
        // Return an empty array if no solution is found
        return new int[] {};
    }
}
