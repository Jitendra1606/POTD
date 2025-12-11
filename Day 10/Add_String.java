class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder add = new StringBuilder();
        int i = num1.length() - 1;// for indexing
        int j = num2.length() - 1;// bcz indexing starts from zero
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int a = (i >= 0) ? num1.charAt(i) - '0' : 0; // '7'-'0' - converts characters to numbers
            int b = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = a + b + carry;
            add.append(sum % 10); // if carry comes in first place also then we only needs unit digit and we can
                                  // get it with % operator and can add this carry on next sum
            carry = sum / 10; // if sum > 10 then carry will come
            i--;
            j--;
        }
        return add.reverse().toString();
    }
}