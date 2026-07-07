package com.fileio;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Nava Bharath\\OneDrive\\Desktop\\My Pages\\Bharath\\File.txt");
		boolean status = f.createNewFile();
//		boolean status = f.delete();
		if (status) {
			System.out.println("File Created Successfully");
		} else {
			System.out.println("File Already Created");
		}

		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalFile());

//		if (status) {
//			System.out.println("File Delete Successfully");
//		} else {
//			System.out.println("File No File Exists Created");
//		}
	}

}
