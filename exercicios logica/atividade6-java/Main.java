import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		
		double ATri = (A * C)/2;
		double ACir = pi * Math.pow(C, 2.0);
		double ATra = (A + B) * C / 2;
		double AQua = B * B;
		double ARet = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", ATri);
		System.out.printf("CIRCULO: %.3f%n", ACir);
		System.out.printf("TRAPEZIO: %.3f%n", ATra);
		System.out.printf("QUADRADO: %.3f%n", AQua);
		System.out.printf("RETANGULO: %.3f%n", ARet);
		
		sc.close();
	}

}
