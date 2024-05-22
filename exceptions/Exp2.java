package exceptions;

public class Exp2 {

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		try {
		int b=a[1]+a[3];
		System.out.println(b);
		}
		catch(Exception e){
			
		}
		try {
			int b=a[1]+a[5];
			System.out.println(b);
			}
			catch(Exception e){
				System.out.println("Array out of bound exception");
			}
	}

}
