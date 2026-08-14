package TGHCodingQuestions;

import java.util.HashSet;
import java.util.Set;

public class UniquePair {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 7, 8, 9 };
		int target = 11;

		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
			int deff = target - num;
			if (set.contains(deff)) {
				System.out.println(num + "," + deff);

			}
			set.add(num);
		}

	}
}
