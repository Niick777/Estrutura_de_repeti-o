
import java.util.Scanner;

public class Exerc�cio_2 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int n,x=1;
		System.out.print("Digite um n�mero: ");
		n=entrada.nextInt();
		
		do {System.out.println(x);
		x++;
		}while(x<n);
		System.out.print(x);
		
		
		
	}
	

}
