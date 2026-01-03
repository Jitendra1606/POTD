class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (st.size() == 0) {
                list.add(-1);
            } else if (st.size() > 0 && st.peek() > arr[i]) {
                list.add(st.peek());
            } else if (st.size() > 0 && st.peek() <= arr[i]) {
                while (st.size() > 0 && st.peek() <= arr[i]) {
                    st.pop();
                }
                if (st.size() == 0) {
                    list.add(-1);
                } else {
                    list.add(st.peek());
                }
            }
            st.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
}
