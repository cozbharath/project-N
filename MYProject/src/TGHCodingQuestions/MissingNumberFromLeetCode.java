package TGHCodingQuestions;

public class MissingNumberFromLeetCode {

	public static void main(String[] args) {
		int[] num = { 0, 1, 3 };

		int sum = 0;

		for (int a : num) {
			sum += a;
		}

		int n = num.length;

		int arrSum = n * (n + 1) / 2;

		System.out.println(arrSum - sum);

	}

}
