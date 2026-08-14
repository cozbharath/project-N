package TGHCodingQuestions;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int temp;
		for (int i = 0; i < arr.length / 2; i++) {
			int j = arr.length - 1 - i;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
