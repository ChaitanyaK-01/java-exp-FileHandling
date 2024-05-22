package exceptions;

import java.io.*;

public class Exp3 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		System.out.println("enter three two number");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println("addition :"+c);

	}

}
