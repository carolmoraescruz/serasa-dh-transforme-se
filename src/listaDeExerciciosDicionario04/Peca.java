package listaDeExerciciosDicionario04;

public abstract class Peca {

	private String modelo;
	private String marca;
	
	public abstract void retirada();

	public Peca() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Peca(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
