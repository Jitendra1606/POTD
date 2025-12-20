
class Solution {
    public String compressedString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            int cnt = 0;
            while (i < n && s.charAt(i) == ch && cnt < 9) {
                cnt++;
                i++;
            }
            sb.append(cnt).append(ch);
        }
        return sb.toString();
    }
}
// Time complexity -- O(N) , bcz pointer is only moving forward not restarting
// everytime