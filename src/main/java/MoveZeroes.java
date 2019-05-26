
public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
		for (int a : nums) {
			System.out.print(a + ",");
		}
	}
	public static void moveZeroes(int[] nums) {
        if (nums == null) return;
        int len = nums.length;
        if (len < 2) return;
        
        int slow = 0, fast = 1;
        while (slow < len && fast < len) {
			while (nums[slow] != 0 && slow < len) {
				slow++;
			}
			fast = slow + 1;
			if (fast >= len) return;
			while (fast < len && nums[fast] == 0) {
				fast++;
				if (fast >= len) return;
			}
			swap(nums, slow, fast);
			slow++;
		}
        
    }
	public static void swap(int[] nums, int s, int r) {
		int t = nums[s];
		nums[s] = nums[r];
		nums[r] = t;
	}

}
