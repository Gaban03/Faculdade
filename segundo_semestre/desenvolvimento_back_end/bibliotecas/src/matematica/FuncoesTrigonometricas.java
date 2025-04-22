package matematica;

import java.util.Scanner;

public class FuncoesTrigonometricas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um valor de ângulo em graus: ");
		double angulo = scan.nextDouble();
		angulo = Math.toRadians(angulo);
		System.out.println();
		System.out.printf("Seno: %.2f\n", Math.sin(angulo));
		System.out.printf("Cosseno: %.2f\n", Math.cos(angulo));
		System.out.printf("Tangente: %.2f\n", Math.tan(angulo));
		System.out.println();

		System.out.print("Digite a tangente: ");
		double tangente = scan.nextDouble();
		double arcoTangente = Math.atan(tangente);
		System.out.printf("Ângulo da tangente: %.2f° \n", Math.toDegrees(arcoTangente));

		scan.close();

	}

}
