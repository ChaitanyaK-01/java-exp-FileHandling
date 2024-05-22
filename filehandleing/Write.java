package filehandleing;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) throws IOException {
		FileWriter f1 =new FileWriter("c:\\chaitanya\\chaitanya.txt");
		f1.write("hey coders , what are you doing!");
		f1.close();
		System.out.println("written ");
	}

}
