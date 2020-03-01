package leetcode;

import java.util.HashMap;


public class FirstUniqueCharacterinaString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("leetcode"));
	}
    public static int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
			return -1;
		}
        int len = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
        	if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
        for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			if (map.get(c) == 1) {
				return i;
			}
		}
        return -1;    
    }
}
