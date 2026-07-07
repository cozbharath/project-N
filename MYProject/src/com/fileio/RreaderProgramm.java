package com.fileio;

import java.io.FileReader;
import java.io.IOException;

public class RreaderProgramm {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr = new FileReader(
				"C:\\\\Users\\\\Nava Bharath\\\\OneDrive\\\\Desktop\\\\My Pages\\\\Bharath\\\\File.txt");
		int i = fr.read();
		while (i != -1) {
			System.out.print((char) i + " ");
			i = fr.read();
		}
		Thread.sleep(50000);
		fr.close();
	}

}
