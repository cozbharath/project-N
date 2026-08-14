package TGHCodingQuestions;

public class FindingDuplicates {

	public static void main(String[] args) {
		String str = "Bharath";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (c == str.charAt(j)) {
					count++;

				}
			}

			boolean status = false;

			for (int j = 0; j < i; j++) {
				if (str.charAt(j) == c) {
					status = true;
					break;
				}
			}
			if (count > 1 && !status) {
				System.out.println(c);
			}
		}
	}

}
