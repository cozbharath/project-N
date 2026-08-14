package TGHCodingQuestions;

import java.util.*;

public class ZigZagNonPrime {

	static boolean isPrime(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {

		int N = 5;
		int num = 1;

		for (int row = 1; row <= N; row++) {

			List<Integer> list = new ArrayList<>();

			while (list.size() < row) {

				if (!isPrime(num))
					list.add(num);

				num++;
			}

			if (row % 2 == 0)
				Collections.reverse(list);

			for (int x : list)
				System.out.print(x + " ");

			System.out.println();
		}
	}
}
