import java.util.Scanner;

public class Exercício_5 {
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		String sexo;
		int x=1,y=0;
		double sal,alt,saln=0,altma=0,altme=3,med;
		do{System.out.printf("Digite seu sexo (Masculino ou Feminino): ",x);
		sexo=entrada.next();
		x++;
		System.out.printf("Digite sua altura: ");
		alt=entrada.nextDouble();
		System.out.printf("Digite o seu salário: ");
		sal=entrada.nextDouble();
		System.out.println();
		System.out.println();
		if(altma<alt) {
			altma=0;
			altma=altma+alt;}else {}
		if(altme>alt) {
			altme=0;
			altme=altme+alt;
		}
		 saln=saln=+sal;
		if(sexo.contentEquals("feminino") && sal<1000.00){
			y++;}else {}
		}while(x<21);
		med=saln/2;
		System.out.printf("Média de salário do grupo: "+med+"\n"
				+"Maior altura do grupo: "+altma+"\n"
						+"Menor altura do grupo: "+altme+"\n"
						+"Número de mulheres com salário de até 1000.00 R$ : "+y+"");
	
	
	
	}

}
