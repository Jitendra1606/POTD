class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.size() == 0) {
                list.add(i + 1);
            } else if (s.size() > 0 && arr[i] < arr[s.peek()]) {
                list.add(i - s.peek());
            } else if (s.size() > 0 && arr[i] >= arr[s.peek()]) {
                while (s.size() > 0 && arr[i] >= arr[s.peek()]) {
                    s.pop();
                }
                if (s.size() == 0) {
                    list.add(i + 1);
                } else {
                    list.add(i - s.peek());
                }
            }
            s.push(i);
        }
        return list;
    }
}