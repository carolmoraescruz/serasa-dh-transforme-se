package aula220325_a_220330;

public class PessoaJuridica extends PessoaHeranca {
	
	private String cnpj;
	private String segmento;
	private String responsável;
	
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String cnpj, String segmento, String responsável) {
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.responsável = responsável;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getResponsável() {
		return responsável;
	}
	public void setResponsável(String responsável) {
		this.responsável = responsável;
	}
	
	

}
