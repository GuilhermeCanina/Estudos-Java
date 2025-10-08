import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int func = sc.nextInt();
		int hora = sc.nextInt();
		double salariohora = sc.nextDouble();
		
		double salariofinal = salariohora * hora;
		
		System.out.printf("Número = %d%n", func);
		
		System.out.printf("Salario = R$ %.2f%n", salariofinal);
		
		sc.close();
		
	}

}
