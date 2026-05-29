package com.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File("C:\\Java\\Nava\\java.txt");

		boolean status = f.createNewFile();

		if (status) {
			System.out.println("File Created Successfully");
		} else {
			System.out.println("Something went Wrong");
		}

		FileReader fr = new FileReader(f);

		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);

			i = fr.read();
			Thread.sleep(1000);
		}

	}

}
