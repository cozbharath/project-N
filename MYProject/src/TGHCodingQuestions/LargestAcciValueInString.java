package TGHCodingQuestions;

public class LargestAcciValueInString {

	public static void main(String[] args) {
		String str = "BHARATH";

		char[] ch = str.toCharArray();
		char c = ' ';
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > max) {
				max = ch[i];
				c = ch[i];
			}
		}
		System.out.println(c);
	}

}
