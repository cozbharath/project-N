package TGHCodingQuestions;

public class NumberDuplicate {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 25, 60, 45, 20, 45 };

		for (int i = 0; i < arr.length; i++) {
			boolean status = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
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
