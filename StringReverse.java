import java.util.Scanner;

class StringReverse{

	public static void main(String[] args) {

		String rev ="";
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string:");
		String str = s.nextLine();
		int length = str.length();
		for(int i = length-1; i>=0; i--)

			rev = rev + str.charAt(i);

		System.out.println("reverse:"+rev);
	}
}