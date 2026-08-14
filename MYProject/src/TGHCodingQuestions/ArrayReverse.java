package TGHCodingQuestions;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int temp = 0;

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
