package FileHandling;

import java.io.File;

public class FileInformation {
	public static void main(String[] args) {
		File myObj = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Self_Check_in(Sprint-2)\\FileHandling1\\SCI.txt");
		if(myObj.exists()) {
			System.out.println("File Name :" + myObj.getName());
			System.out.println("Absolute Path :" + myObj.getAbsolutePath());
			System.out.println("Writable :" + myObj.canWrite());
			System.out.println("Readable :" + myObj.canRead());
			System.out.println("File size in Bytes :" + myObj.length());
		} else {
			System.out.println("The File does not exists.");
		}
	}
}
