import java.util.HashMap;


public class RansomNote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(canConstruct("aa","aaab"));
	}
	public static boolean canConstruct(String ransomNote, String magazine) {
		if (magazine == null) return false;
		if (ransomNote == null) return false;
		int lenr = ransomNote.length(), lenm = magazine.length();
		if (lenm == 0 && lenr > 0) return false;
		if (lenm == 0 && lenr == 0) return true;
		if (lenr == 0) return false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < lenm; i++) {
			char c = magazine.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		for (int i = 0; i < lenr; i++) {
			char c = ransomNote.charAt(i);
			if (!map.containsKey(c)) {
				return false;
			} else {
				if (map.get(c) <= 0) {
					return false;
				} else {
					map.put(c, map.get(c) - 1);
				}
			}
		}
		
		return true;
        	
    }

}
