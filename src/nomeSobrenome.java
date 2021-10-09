import java.util.Scanner;

public class nomeSobrenome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu primeiro nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Seja Bem vindo!: "+ nome + " " + sobrenome);
		
		scanner.close();
	}
}
