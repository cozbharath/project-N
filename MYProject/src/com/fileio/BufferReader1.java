package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr = new FileReader(
				"C:\\\\Users\\\\Nava Bharath\\\\OneDrive\\\\Desktop\\\\My Pages\\\\Bharath\\\\File.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
			Thread.sleep(5000);
		}

		br.close();
		fr.close();
	}

}
