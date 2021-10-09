import java.util.Scanner;

public class calculoDesconto {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valor = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Integer quantidade = scanner.nextInt();
		
		Double desconto = 0.0;
		Boolean compraComDesconto = quantidade >= 10;
		
		if (compraComDesconto) {
			desconto = 10.0;
		}
		Double subtotal = quantidade * valor;
		Double valorDesconto = (subtotal * desconto) / 100;
		Double valorTotal = subtotal - valorDesconto;
		
		System.out.println("O valor final da compra é de  " + valorTotal);
		
		scanner.close();
		
	}

}
