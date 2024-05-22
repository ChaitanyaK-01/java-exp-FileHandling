package filehandleing;

import java.io.File;

public class Checkfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("c:\\chaitanya\\chaitanya.txt");
				if(f1.exists()) {
					System.out.println("file exist");
				}
				else {
					System.out.println("file not exist");
				}

	}

}
