
public class ArraysString {

	public static void main(String[] args) {
		String str = "3[a]2[bc]";
		char[] ch = str.toCharArray();
		char result = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(i)) {
				result = str.charAt(i);
			}
		}
		System.out.println(result);
	}

}
