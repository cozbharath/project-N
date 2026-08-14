package TGHCodingQuestions;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		int arrSum = 0;
		int sum = 0;
		int missingNumber = 0;

		for (int i = 0; i <= arr.length + 1; i++) {
			arrSum += i;
		}

		for (int a : arr) {
			sum += a;
		}

		System.out.println(arrSum);
		System.out.println(sum);
		missingNumber = arrSum - sum;
		System.out.println(missingNumber);
	}

}
