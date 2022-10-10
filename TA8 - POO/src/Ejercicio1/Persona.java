package Ejercicio1;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private int altura;
	
	//Constantes
	private final char SEXO_D='H';
	
	//Constructor por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni = "";
		this.sexo = 'H';
		this.peso = 0.0;
		this.altura = 0;
	}

	//Un constructor con el nombre, edad y sexo, el resto por defecto
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	//Constructor con todos lo satributos como parámetro
	public Persona(String nombre, int edad, String dni, char sexo, double peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSEXO() {
		return sexo;
	}

	public void setSEXO(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}
