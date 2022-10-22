package exerciciojava;
import java.util.Scanner;
public class ExercicioJava {
    public static void main(String[] args) {
        
		Scanner entrada = new Scanner(System.in);
                Pessoa pessoa = new Pessoa();
                
                System.out.println("Digite o seu nome:");
                pessoa.setNome(entrada.nextLine());
		while (pessoa.getSexo() != 1 && pessoa.getSexo() != 2){
		
			System.out.println("Escolha o seu sexo:");
			System.out.println("Masculino: 1");
			System.out.println("Feminino: 2");
			pessoa.setSexo(entrada.nextInt());
		}

		System.out.println("Entre com sua altura:");
		pessoa.setAltura(entrada.nextDouble());
		System.out.println("Agora entre com seu peso atual:");
		pessoa.setPesoAtual(entrada.nextDouble());
		
                double h = pessoa.getAltura();
                int sexo = pessoa.getSexo();
                pessoa.calculaPesoIdeal(h, sexo);
                
                double pesoIdeal = pessoa.getPesoIdeal();
                double pesoAtual = pessoa.getPesoAtual();
                String nome = pessoa.getNome();
                pessoa.verificaResultado(nome, pesoAtual, pesoIdeal);
                

					

			
    }
    
}
