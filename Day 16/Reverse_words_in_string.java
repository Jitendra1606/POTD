class Solution {
    public String reverseWords(String s) {
        s = s.trim();// removes any trailing and leading spaces
        String[] arr = s.split("\\s+");// removes multiple spaces
        int n = arr.length;// converting into array of strings
        reverse(arr, 0, n - 1);// then simply reversing elemnts of array with function
        return String.join(" ", arr);// again converts to normal string
    }

    public void reverse(String[] arr, int start, int end) {
        while (start < end) {// fun to reverse elements of array
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}