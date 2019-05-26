import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class IntersectionofTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ans = intersection(new int[]{2,2,3}, new int[]{2,2});
		for (int i = 0; i < ans.length; i++) {		
		System.out.print(ans[i] + ",");
		}
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null) return null;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < nums1.length; i++) {
			int ni = nums1[i];
			map.put(ni, 1);
		}
		
		for (int i = 0; i < nums2.length; i++) {
			int ni = nums2[i];
			if (map.containsKey(ni)) {
				if (map.get(ni) > 0) {
					list.add(ni);
					map.put(ni, 0);
				}
			}
		}
		int[] res = new int[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
		
		return res;
        
    }
}
