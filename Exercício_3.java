import java.util.Scanner;

public class Exerc�cio_3 {
	
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		float x,med,som=0;
		int y=1;
		do {
			System.out.printf("Digite um n�mero: ",y);
			x=entrada.nextFloat();
			y++;
			som=som+x;
		}while(y<21);
		med=som/2;
		System.out.println("Soma dos valores: "+som+"\n"
				+"M�dia da soma dos valores: "+med+"");
	}

}
