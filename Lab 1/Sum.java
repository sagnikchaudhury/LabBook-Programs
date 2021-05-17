package corejava8labexercises;
import java.util.Scanner;

public class Sum {

	public static int calculateSum(int range) {
		int sum = 0, i;
		for (i=1; i <= range; i++) {
			if(i%3 == 0 || i%5 == 0)
				sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Sum of first " + num + " numbers which are divisible by 3 or 5 is: " + calculateSum(num));
		sc.close();

	}

}