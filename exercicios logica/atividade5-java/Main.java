import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double val1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double val2 = sc.nextDouble();
		
		double valfim = val1 * num1 + val2 * num2;
		
		System.out.printf("Valor a Pagar: R$ %.2f%n", valfim);
		
		sc.close();
	}

}
