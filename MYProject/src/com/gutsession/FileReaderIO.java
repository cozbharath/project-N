package com.gutsession;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderIO {

	public static void main(String[] args) throws IOException {
		FileReader fw = new FileReader(
				"C:\\\\Users\\\\Nava Bharath\\\\OneDrive\\\\Desktop\\\\My Pages\\\\Bharath\\\\nava.txt");

		BufferedReader br = new BufferedReader(fw);

		String line;
		int sum = 0;
		int invalidCount = 0;

		while ((line = br.readLine()) != null) {

			try {
				int number = Integer.parseInt(line.trim());
				sum = sum + number;

			} catch (NumberFormatException e) {
				invalidCount++;
			}
		}

		System.out.println(sum);
		System.out.println(invalidCount);

		br.close();
		fw.close();

	}

}
