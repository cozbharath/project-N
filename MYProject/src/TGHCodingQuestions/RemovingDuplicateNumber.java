package TGHCodingQuestions;

public class RemovingDuplicateNumber {

	public static void main(String[] args) {
		String[] arr = { "b", "h", "a", "r", "a", "t", "h" };

		for (int i = 0; i < arr.length; i++) {
			boolean status = false;
			for (int j = 0; j < i; j++) {
				if (arr[i].equals(arr[j])) {
					status = true;
					break;
				}
			}

			if (!status) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
