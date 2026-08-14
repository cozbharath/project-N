package TGHCodingQuestions;

public class FindingDuplicateArray {

	public static void main(String[] args) {
		String[] arr = { "b", "h", "a", "r", "a", "t", "h" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (!arr[i].equals(arr[j])) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
	}

}
