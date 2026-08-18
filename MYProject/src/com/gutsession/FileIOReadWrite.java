package com.gutsession;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOReadWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Nava Bharath\\OneDrive\\Desktop\\My Pages\\Bharath\\nava.txt");
		boolean status = f.createNewFile();

		if (status) {
			System.out.println("File Created Successfully");
		} else {
			System.out.println("File Existed Already");
		}

		FileWriter fw = new FileWriter("C:\\Users\\Nava Bharath\\OneDrive\\Desktop\\My Pages\\Bharath\\nava.txt",
				false);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("10");
		bw.newLine();
		bw.write("20");
		bw.newLine();
		bw.write("ABC");
		bw.newLine();
		bw.write("30");
		bw.newLine();
		bw.write("XYZ");
		bw.newLine();
		bw.write("40");
		bw.newLine();

		System.out.println("Values Inserted");
		bw.close();
	}

}
