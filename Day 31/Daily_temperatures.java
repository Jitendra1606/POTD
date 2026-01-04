
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                ans[i] = 0;
            } else if (!s.isEmpty() && arr[i] < arr[s.peek()]) {
                ans[i] = 1;
            } else if (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                    s.pop();
                }
                if (s.isEmpty()) {
                    ans[i] = 0;
                } else {
                    ans[i] = s.peek() - i;
                }
            }
            s.push(i);
        }
        return ans;
    }
}