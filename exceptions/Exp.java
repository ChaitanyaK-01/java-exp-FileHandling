package exceptions;
import java.util.*;
public class Exp {

	public static void main(String[] args) {
		int a=100;
		int b=0;
		int c;
		try {
			c=a/b;
			System.out.println("result "+c);
		}
		catch (Exception e){
			System.err.println("devided by zero");
			
		}
		

	}

}
