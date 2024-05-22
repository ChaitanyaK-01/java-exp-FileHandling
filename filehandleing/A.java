package filehandleing;

import java.io.File;

public class A {
public static void main(String args[]) {
	File f1=new File ("c:\\chaitanya\\chaitanya.txt");
	if(f1.exists()) {
		System.out.println("file name0"+f1.getName());
		System.out.println("file path:"+f1.getAbsolutePath());
		System.out.println("writeable or not :"+f1.canWrite());
		System.out.println("readable or not:"+f1.canRead());
		System.out.println("total char :"+f1.length());
		
	}
	else {
		System.out.println("file not exist");
	}
	
}
}
