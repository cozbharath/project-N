package TGHCodingQuestions;

public class SmallestAcciValueInString {

	public static void main(String[] args) {
		String str = "BHARATH";

		char[] ch = str.toCharArray();
		char c = ' ';
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] < min) {
				min = ch[i];
				c = ch[i];
			}
		}
		System.out.println(c);
	}

}
