class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums); // sorting array so that min and max element comes at extreme positions
        int first = nums[0]; // storing first value
        int last = nums[nums.length - 1]; // storing last value
        int gcd = 1; // initialising gcd with 1
        for (int i = 1; i <= first; i++) { // running a loop 1 to smaller value of two numbers because gcd can't exceed
                                           // this number
            if ((first % i == 0) && (last % i == 0)) { // if a index number divides both number at same time then given
                                                       // number is gcd otherwise not
                gcd = i;
            }
        }
        return gcd;
    }
}

// Time Complexity -- O(N) (Our solution is good for small inputs but very bad
// for large inputs)
// We know there is a Eucledian method to calculate gcd but first we will learn
// about it as we can't understand it's concept right now , but it's solution is
// like this way as we thought earlier
class Solution {
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return gcd(max, min);
    }
}