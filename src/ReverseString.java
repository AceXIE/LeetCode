import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(reverseString("Hello"));
		
	}
	public static String reverseString(String s) {
        s.trim();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        
        return stringBuilder.toString();
        
    }
}
