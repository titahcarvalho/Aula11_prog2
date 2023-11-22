package prog2_aula11;

public class Vacina2 {
	private String nome;
	private String fabricante;
	private int validade;
	private int diaFab, mesFab, anoFab;
	private int diaAtual, mesAtual, anoAtual;
	
	public Vacina2(String nome, String fabricante, int validade, int diaFab, int mesFab, int anoFab, int diaAtual, int mesAtual, int anoAtual) {
		this.nome = nome;
		this.fabricante = fabricante;
		
		this.anoAtual = anoAtual;
		this.anoFab = anoFab;
		this.diaAtual = diaAtual;
		this.diaFab = diaFab;
		this.mesAtual = mesAtual;
		this.mesFab = mesFab;
		
		int diferencadeanos = anoAtual - anoFab;
		
		if((this.diaFab <= this.diaAtual) && (mesFab < mesAtual || mesFab == mesAtual && diferencadeanos <= 3)){
			this.validade = diferencadeanos; 
		} else {
			this.validade = -1;
			
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public int getDiaFab() {
		return diaFab;
	}

	public void setDiaFab(int diaFab) {
		this.diaFab = diaFab;
	}

	public int getMesFab() {
		return mesFab;
	}

	public void setMesFab(int mesFab) {
		this.mesFab = mesFab;
	}

	public int getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}

	public int getDiaAtual() {
		return diaAtual;
	}

	public void setDiaAtual(int diaAtual) {
		this.diaAtual = diaAtual;
	}

	public int getMesAtual() {
		return mesAtual;
	}

	public void setMesAtual(int mesAtual) {
		this.mesAtual = mesAtual;
	}

	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	public String toString() {
		return "Nome: " +nome+ "\nFabricante: " + fabricante + "\nValidade: " + validade + "\nData de fabricação: " + diaFab + "/" + mesFab + "/" +anoFab+ "\nData atual: " + diaAtual + "/" + mesAtual + "/" + anoAtual;
 	}
}
	


