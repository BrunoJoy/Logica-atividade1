import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2;
		int peso1 = 2, peso2 = 3;
		
		System.out.print("Digita a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digita a segunda nota: ");
		nota2 = sc.nextDouble();
		
		double media = ((nota1 * peso1)+(nota2 * peso2))/ (peso1 + peso2);
		
		System.out.println("Média: "+media);
		
		boolean isAprovado = media >= 7;
		System.out.println("situação do aluno: "+isAprovado);
		
		//Desafio
		if(isAprovado)
		{
			System.out.println("Aluno aprovado com média: "+media);
		}else
		{
			double pontuacaoParaPassaNaFinal = 10 - media;
			System.out.println("Aluno irá para final precisando da nota mínima de: "+pontuacaoParaPassaNaFinal);	
		}

	}

}
