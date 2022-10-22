
package exerciciojava;

public class Pessoa {
    private String nome;
    private int sexo;
    private double altura;
    private double pesoAtual;
    private double pesoIdeal;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public double getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(double pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public void calculaPesoIdeal(double h, int sexo){
            
        if (sexo == 1) {
            setPesoIdeal(Math.round(((72.7 * h) - 58)));				
            System.out.println("Sexo: Masculino");				
	} 
	else if (sexo == 2) {
        	setPesoIdeal(Math.round(((62.1 * h) - 44.7)));
		System.out.println("Sexo: Feminino");
	}else {
        	System.out.println("Escolha um sexo válido!!");
	} 

	}
    
    public void verificaResultado(String nome, double pesoAtual, double pesoIdeal){
        if (pesoAtual > pesoIdeal) {
            System.out.println(nome+", você está acima do peso, seu peso ideal é de aproximadamente: " + Math.round(pesoIdeal) +" Kg.");
	} else if (pesoAtual < pesoIdeal) {
            System.out.println(nome+", você está abaixo do peso, seu peso ideal é de aproximadamente: " + Math.round(pesoIdeal) +" Kg.");
	} else {
            System.out.println(nome+", você está dentro do peso");
	}
    }
}
