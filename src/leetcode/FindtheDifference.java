package leetcode;

import java.util.HashMap;


public class FindtheDifference {

	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));
	}
	public static char findTheDifference(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        char ans = '1';
        String minString = "";
        String maxString = "";
        if (lens < lent) {
        	minString = s;
        	maxString = t;
        } else {
        	minString = t;
        	maxString = s;
        }
        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < minString.length(); i++) {
        	char c = minString.charAt(i);
        	if (map.containsKey(c)) {
        		map.put(c, map.get(c) + 1);
        	} else {
        		map.put(c, 1);
        	}
        }
        for (int i = 0; i < maxString.length(); i++) {
        	char c = maxString.charAt(i);
        	if (map.containsKey(c)) {
        		if (map.get(c) == 0) {
        			ans = c;
        			break;
        		} else {
        			map.put(c, map.get(c) - 1);	
        		}
        	} else {
        		ans = c;
        		break;
        	}
        }
        return ans;
    }
}
