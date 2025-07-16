class Solution {
    public int myAtoi(String a) {
           a = a.trim();
        int res = 0;
        boolean firstnumnotzero = false;
        int sign = 1;
        boolean signSeen = false;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            // Sign processing
            if (!firstnumnotzero && (ch == '-' || ch == '+')) {
                if (signSeen) return 0;
                signSeen = true;
                sign = (ch == '-') ? -1 : 1;
                continue;
            }

            // If digit
            if (ch >= '0' && ch <= '9') {
                int digit = ch - '0';
                firstnumnotzero = true;

                // ✅ Check overflow before updating res
                if (res > Integer.MAX_VALUE / 10 ||
                        (res == Integer.MAX_VALUE / 10 && digit > (sign == 1 ? 7 : 8))) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                res = res * 10 + digit;
            } else if (firstnumnotzero) {
                break;
            } else {
                return 0;
            }
        }

        return res * sign;
        
    }
}