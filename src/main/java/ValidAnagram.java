import java.util.HashMap;


public class ValidAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isAnagram("car", "tarj"));

	}
	public static boolean isAnagram(String s, String t) {
        if (s == null) return t == null;
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
        for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (!map.containsKey(c)) {
				return false;
			} else {
				if (map.get(c) == 0) {
					return false;
				} else {
					map.put(c, map.get(c) - 1);
				}
			}
		}
        return true;
    }
}
