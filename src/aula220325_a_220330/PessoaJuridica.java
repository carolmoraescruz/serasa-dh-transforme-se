package aula220325_a_220330;

public class PessoaJuridica extends PessoaHeranca {
	
	private String cnpj;
	private String segmento;
	private String respons�vel;
	
	public PessoaJuridica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PessoaJuridica(String cnpj, String segmento, String respons�vel) {
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.respons�vel = respons�vel;
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
	public String getRespons�vel() {
		return respons�vel;
	}
	public void setRespons�vel(String respons�vel) {
		this.respons�vel = respons�vel;
	}
	
	

}
