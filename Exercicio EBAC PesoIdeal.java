import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		double h=0, pesoIdeal=0, pesoAtual=0;
		int sexo = 0;

		Scanner entrada = new Scanner(System.in);

		while (sexo != 1 && sexo != 2){
		
			System.out.println("Escolha o seu sexo:");
			System.out.println("Masculino: 1");
			System.out.println("Feminino: 2");
			sexo = entrada.nextInt();
		}

		System.out.println("Entre com sua altura:");
		h = entrada.nextDouble();
		System.out.println("Agora entre com seu peso atual:");
		pesoAtual = entrada.nextDouble();
			
			if (sexo == 1) {
				
				pesoIdeal = Math.round(((72.7 * h) - 58));				
				System.out.println("Sexo: Masculino");				
			} 
			
				else if (sexo == 2) {

					pesoIdeal = Math.round(((62.1*h) - 44.7));
					System.out.println("Sexo: Feminino");
				} 

					else {

						System.out.println("Escolha um sexo válido!!");
					}

			if (pesoAtual > pesoIdeal) {
						System.out.println("Você está acima do peso, seu peso ideal é de aproximadamente: " + Math.round(pesoIdeal) +" Kg.");
					} else if (pesoAtual < pesoIdeal) {
						System.out.println("Você está abaixo do peso, seu peso ideal é de aproximadamente: " + Math.round(pesoIdeal) +" Kg.");
					} else {
						System.out.println("Você está dentro do peso");
					}
	}