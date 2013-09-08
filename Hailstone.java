import java.util.Scanner;
public class Hailstone {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);

		String str1 = "Enter a number: ";
		System.out.println(str1);
		int newNum = reader.nextInt();

	while (newNum > 0 && newNum !=1) {
		while (newNum % 2 == 0) {
			newNum = newNum/2;
			System.out.println(newNum);
		}
		
		while (newNum != 1 && newNum % 2 != 0) {
			newNum = ((3*newNum) + 1);
			System.out.println(newNum);
		}	
		if (newNum == 1) {
			System.out.println("Calculation stopped.");
		}
	}
}
}