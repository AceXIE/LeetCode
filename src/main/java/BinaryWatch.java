import java.util.ArrayList;
import java.util.List;


public class BinaryWatch {

	public static void main(String[] args) {
		List<String> ansList = readBinaryWatch(1);
		for (String s : ansList) {
			System.out.print(s + ",");
		}
	}
	public static List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
        	for (int m = 0; m < 60; m++) {
        		if (Integer.bitCount(i*64 + m) == num) {
        			list.add(String.format("%d:%02d", i, m));
        		}
        	}
        }
        
        return list;
    }
	
	
}
