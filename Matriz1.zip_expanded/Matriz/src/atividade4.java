import java.util.Scanner;

public class atividade4 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		int matriz [][] = new int [6][6];
		
		System.out.println("escreva o número que você quer buscar na matriz: ");
		num = sc.nextInt();
		
		for (int linha = 0;linha < 6; linha++) {
			for (int coluna = 0; coluna < 6;coluna ++) {
				System.out.println("escreva os números da matriz: "+"["+(linha+1)+"]"+"["+(coluna+1)+"]");
				matriz [linha][coluna] = sc.nextInt();
				
				if ( matriz[linha][coluna] == num ) {
					System.out.println("número encontrado! e esta na linha"+ "["+(linha+1)+"]"+ " e na coluna"+ "["+(coluna+1)+"]");
				}
				else {
					System.out.println("Numero não encontrado");
				}
			}	
		}
	}
}