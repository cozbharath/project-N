package com.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BrWriter1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(
				"C:\\\\Users\\\\Nava Bharath\\\\OneDrive\\\\Desktop\\\\My Pages\\\\Bharath\\\\File.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write('P');
		bw.newLine();
		bw.write("Nava Bharath Kumar");
		bw.newLine();
		bw.write(5000);
		System.out.println("Inserted");
	}

}
