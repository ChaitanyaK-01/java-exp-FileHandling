package filehandleing;

import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		FileReader f1=new FileReader("c:\\chaitanya\\chaitanya.txt");
		int i;
		while((i=f1.read())!=-1) {
			System.out.print((char)i);
		}
		f1.close();
	}

}
