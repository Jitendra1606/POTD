class Solution {
    public int minPartitions(String n) {
        // int[] arr = new int[n.length()];
        // for(int i = 0 ; i < arr.length ; i++){
        // arr[i] = n.charAt(i) - '0';
        // }
        // int ans = Integer.MIN_VALUE;
        // for(int j = 0 ; j < arr.length ; j++){
        // if(arr[j] > ans){
        // ans = arr[j];
        // }
        // }
        // return ans;
        // Time complexity -- O(N)
        // runtime - 5ms(beats 90%)

        int[] arr = new int[n.length()];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n.charAt(i) - '0';// converting string element into integer
            ans = Math.max(arr[i], ans);
        }
        return ans;
        // time complexity -- O(N)
        // runtime - 7ms(beats 35%)
    }
}