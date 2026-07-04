class Solution {
    public String clearDigits(String s) {
        StringBuilder sc = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sc.deleteCharAt(sc.length() - 1);
            } else {
                sc.append(s.charAt(i));
            }
        }

        return sc.toString();
    }
}