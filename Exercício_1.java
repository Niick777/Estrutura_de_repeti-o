import java.util.Scanner;

public class Exerc�cio_1 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int x,y=1;
		do {
			System.out.printf("Digite um n�mero: ",y);
			x=entrada.nextInt();
			y++;
		if(x<0){
			System.out.println("Valor negativo");
			System.out.println();}
		else if(x>0) {
			System.out.println("Valor positivo");
			System.out.println();}
		else {
			System.out.println("Valor neutro");
			System.out.println();}
		}while(y<11);
	}

}
