package Ejercicio4;

public class Serie {
	//Atributos
	private String titulo;
	private int nunTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//Constantes
	private final int NUMTEMPORADAS_D=3;
	private final boolean ENTREGADO_D=false;
	
	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.nunTemporadas = NUMTEMPORADAS_D;
		this.entregado = ENTREGADO_D;
		this.genero = "";
		this.creador = "";
	}

	//Constructror con titulo y creador como parámetro
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	//Construcror con todos los altributos, expcepto de entregado
	public Serie(String titulo, int nunTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.nunTemporadas = nunTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	//Getters y setters
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNunTemporadas() {
		return nunTemporadas;
	}


	public void setNunTemporadas(int nunTemporadas) {
		this.nunTemporadas = nunTemporadas;
	}


	public boolean isEntregado() {
		return entregado;
	}


	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCreador() {
		return creador;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
