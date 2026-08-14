package TGHCodingQuestions;

import java.util.Stack;

public class Question1 {

	public static void main(String[] args) {

		String str1 = "3[a]2[bc]";
		String str2 = "3[a2[bc]]";

		System.out.println(decode(str1));
		System.out.println(decode(str2));
	}

	public static String decode(String str) {

		Stack<Character> s = new Stack<>();

		for (int i = str.length() - 1; i >= 0; i--) {
			s.push(str.charAt(i));
		}

		return StackRemove(s, "", 1);
	}

	public static String StackRemove(Stack<Character> s, String string, int i) {

		String res = "";

		while (!s.isEmpty()) {

			char ch = s.pop();

			// Number
			if (Character.isDigit(ch)) {

				int n = ch - '0';

				// Remove '['
				s.pop();

				String temp = "";
				int bracketCount = 1;

				// Read inside [...]
				while (!s.isEmpty() && bracketCount > 0) {

					char c = s.pop();

					if (c == '[') {
						bracketCount++;
					}

					else if (c == ']') {
						bracketCount--;
					}

					if (bracketCount > 0) {
						temp += c;
					}
				}

				// Decode the content inside the bracket
				String inner = decode(temp);

				// Repeat
				for (int j = 0; j < n; j++) {
					res += inner;
				}

			} else {

				res += ch;
			}
		}

		return res;
	}
}