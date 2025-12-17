class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        // crating a new array to store products
        // n[i] = (product of left)*(product of right)
        // so first we calculate product of left side elements and store them in array
        // at respective index
        // arr[i](a[1])=ar[1-1]*n[1-1](a[0]=1*n[0]=1)and so on
        // so this will multiply numbers but without of number itself
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        } // here array store products of elements

        int right = 1;// here it'll store product of right side elements and then multiply
        // with the left side products
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = arr[i] * right;// updating array elements
            right = right * nums[i];// keep track of right side product
        }
        return arr;
    }
}