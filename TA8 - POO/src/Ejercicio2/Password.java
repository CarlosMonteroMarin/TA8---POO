package Ejercicio2;
import java.security.SecureRandom;

public class Password {
	//Constante de longitud
	private final int LONG_D=8;
	
	//Atributos
	private int longitud;
	private String contraseña;
	
	
	//Constructor por defecto
	public Password() {
		this.longitud = LONG_D;
		this.contraseña = "";
	}

	//Constructor con la variable longitud por parametro
	public Password(int longitud) {
		this.longitud = longitud;
		
	}

	//Getters y setters
	public int getLongitud() {
		return longitud;
	}



	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}



	public String getContraseña() {
		return contraseña;
	}



	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	//metodo para generar contraseñas con el SecureRandom y el StringBuilder
	public StringBuilder generarCon(int longitud) {
		//declaramos un string constante con todos los caracteres que queramos
		final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		//inicializamos el SecureRandom y el StringBuilder
		SecureRandom random= new SecureRandom();
		StringBuilder contraseña = new StringBuilder();
		
		//bucle con la longitud pedida por el usuario 
		for (int i = 0; i < longitud; i++) {
			
			//cada vuelta que hace el for elige un caracter random
			int randomIndex = random.nextInt(CHARS.length());
			contraseña.append(CHARS.charAt(randomIndex));
			
		}
		
		return contraseña;
	}
	
	
	
	
	
}
