import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int matriz [][] = new int [5][5], num [][] = new int [5][5], igual [][] = new int [5][5];
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.println("digite um valor: ");
				matriz [linha][coluna] = sc.nextInt();
				
				if (matriz[linha][coluna] == matriz[coluna][linha]){
					System.out.println("Os números iguais são: "+ matriz[linha][coluna]);
				}
				
				}
			}
		
		for (int linha = 0; linha < 5; linha++) {
			System.out.println();
			for (int coluna = 0; coluna < 5; coluna++) {
				
				System.out.print(matriz[linha][coluna]+ " ");			
				}
		}
	}

}
