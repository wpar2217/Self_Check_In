package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\ADMIN\\eclipse-workspace\\Self_Check_in(Sprint-2)\\FileHandling1\\SCI.txt");
			//myWriter.write("RECORD: 1");
			myWriter.write("PARTHA    23 706147553059 9381008162 kURNOOL");
			myWriter.write("\nSURYA     24 328464365284 6738427564 HYDERABAD");
			myWriter.write("\nUDAY      36 563846382648 8446365682 NELLORE");
			myWriter.write("\nSAI       43 643283264262 9463724648 CHENNAI");
			myWriter.close();
			System.out.println("Successfully wrote to the File.");
		} catch (IOException e) {
			System.out.println("An Error Occured.");
			e.printStackTrace();
		}
	}
}