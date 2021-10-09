import java.util.Scanner;

public class numeroQuadrado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número para calcular o quadrado: ");
		Integer numero = scanner.nextInt();
		
		Integer numeroQuadrado = numero * numero;
		
		System.out.println("O valor do número " + numero + " ao quadrado é: " + numeroQuadrado);
		
		scanner.close();
	}


}
