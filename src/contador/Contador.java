package contador;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Contador {
	
	public static void contar(int inicio, int fim) throws ContadorInvalidosException {
		
		
		if(inicio < fim) {
			
			int contagem = fim - inicio;
			for(int x = 1; x <=contagem; x++) {
				System.out.println(x);
			}
			
		}else {
			System.err.println("Inicio maior que o fim. Favor inserir os valores corretamente.");
			throw new ContadorInvalidosException();
		}

	}
	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		try {
			int inicioContagem = leitor.nextInt();
			int fimContagem = leitor.nextInt();
			
			try {
				contar(inicioContagem,fimContagem);
				
			}catch(Exception e ) {
				
			}finally {
				leitor.close();
			}
		}catch(InputMismatchException e ) {
			System.err.println(e+" Favor inserir um valor numérico.");
			
		}

	}
	

}
