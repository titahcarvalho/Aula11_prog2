package prog2_aula11;
import java.util.Calendar;

public class Vacina {
	private String nome;
	private int codigo;
	private double ml;
	private int dose;
	private int validade;
	private int fabricacao;
	
	public Vacina ( String nome, int codigo, double ml, int dose, int validade,int fabricacao) {

		if (calculaValidade(fabricacao, validade)) {
			this.validade = fabricacao + validade;
		}else {
			System.out.println("Data inválida");
		}
		this.nome = nome;
		this.codigo = codigo;
		this.dose = dose;
		this.ml = ml;
		this.fabricacao = fabricacao;
		
		
		}
	private boolean calculaValidade(int fabricacao, int validade) { 
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		return fabricacao + validade >= anoAtual;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getMl() {
		return ml;
	}
	public void setMl(double ml) {
		this.ml = ml;
	}
	public int getDose() {
		return dose;
	}
	public void setDose(int dose) {
		this.dose = dose;
	}
	public int getValidade() {
		return validade;
	}
	public void setValidade(int validade) {
		this.validade = validade;
	}
	public int getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(int fabricacao) {
		this.fabricacao = fabricacao;
	}

}
