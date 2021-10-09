import java.util.Scanner;

public class calculoIMC {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua altura: ");
		Double altura = scanner.nextDouble();
		
		Double imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: " + imc);
		
		scanner.close();
		
	}

}