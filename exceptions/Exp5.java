package exceptions;

import java.util.Scanner;

public class Exp5 {

	public static void main(String[] args) throws Exception {
		Scanner sc =new Scanner(System.in);
		String a;
	try {
		  System.out.println("enter a string");
		  a=null;
		  System.out.println(a);
			System.out.println(a.toUpperCase());
	}catch (Exception e){
		System.err.println("enter a string . provided input is null");
	}

	}

}
