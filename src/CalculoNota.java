import java.util.Scanner;

public class CalculoNota {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua nota: ");
		Double nota = scanner.nextDouble();
		
		Boolean aprovado = nota >= 70.0;
		
		if (aprovado) {
			System.out.println("Sua nota �: " + nota + ", voc� est� APROVADO(A)!");
		} else {
			System.out.println("Sua nota �: " + nota + ", voc� est� REPROVADO(A)!");
		}
		
		scanner.close();

	}

}
