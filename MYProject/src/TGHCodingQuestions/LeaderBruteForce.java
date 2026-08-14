package TGHCodingQuestions;

public class LeaderBruteForce {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };

		for (int i = 0; i < arr.length; i++) {
			boolean status = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					status = false;
					break;
				}
			}

			if (status) {
				System.out.println(arr[i] + " ");
			}
		}
	}

}
