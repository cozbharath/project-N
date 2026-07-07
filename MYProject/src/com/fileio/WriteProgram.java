package com.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class WriteProgram {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(
				"C:\\\\Users\\\\Nava Bharath\\\\OneDrive\\\\Desktop\\\\My Pages\\\\Bharath\\\\File.txt", true);
		fw.write('A');
		fw.write('\n');
		fw.write("Charan");
		fw.write('\n');
		fw.write("From Vcube");
		fw.write('\n');
		fw.flush();
		fw.close();
		System.out.println("Contend Written in File ");
	}

}
