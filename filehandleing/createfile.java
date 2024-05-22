package filehandleing;
import java.io.*;
public class createfile {

	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\chaitanya\\chaitanya.txt");
		if(f1.createNewFile())
		{
			System.out.println("file created!");
		}
		else {
			System.out.println("file not created");
		}

	}

}
