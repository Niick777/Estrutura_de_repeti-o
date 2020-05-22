import java.util.Scanner;

public class Exercício_4 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int x,y=1,val=0;
		do {
			System.out.printf("Digite um número: ",y);
			x=entrada.nextInt();
			y++;
		if(x>val) {
			val=0;
			val+=x;}else {}
		}while(y<16);
		System.out.print("Maior valor fornecido: "+val+"");
	}

}
