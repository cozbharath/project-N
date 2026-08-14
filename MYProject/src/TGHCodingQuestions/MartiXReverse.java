package TGHCodingQuestions;

public class MartiXReverse {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < n / 2; j++) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][n - 1 - j];
					arr[i][n - 1 - j] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(arr[i][j] * arr[i][j] + " ");
				} else if (i % 2 == 0) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] * 2 + " ");
				}
			}
			System.out.println();
		}
	}

}
