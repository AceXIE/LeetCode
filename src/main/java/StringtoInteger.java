
public class StringtoInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(myAtoi("  -0012a42"));
	}
    public static int myAtoi(String str) {
    	
        if (str.equals("") || str.length() < 1) return 0;
        double ans = 0;
        boolean b = false;
        str = str.trim();
        int i = 0;
        if (str.charAt(0) == '-') {
			b = true;
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
        for (; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				ans  = 10 * ans + (c - '0');
			} else {
				break;
			}
		}
        if (b) {
			ans = -ans;
		}
        if (ans <= Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
        if (ans >= Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
        return (int)ans;
    }

}
