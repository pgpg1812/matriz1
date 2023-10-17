import java.util.Scanner;

public class Questão5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		int matriz [][] = new int [4][4], igual[][] = new int [4][4], outros[][] = new int [4][4];
		
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.println("digite um valor: ");
				matriz [linha][coluna] = sc.nextInt();
				
				if (linha == coluna) {
					igual[linha][coluna] = matriz [linha][coluna];
				}
				else {
					outros[linha][coluna] = matriz [linha][coluna];
				}
			}

		}
		System.out.print("\nDiagonais:");
		for (int linha = 0; linha < 4; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.print(igual[linha][coluna]+ " ");
					
				}
			}
		
		System.out.print("\n\nNão diagonais: ");
		for (int linha = 0; linha < 4; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 4; coluna++) {
				System.out.print(outros[linha][coluna]+ " ");
					
				
				}
			}
		}
	}


