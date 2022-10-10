package Ejercicio2;
import java.util.Scanner;

public class mainPasswordApp extends Password{

	public static void main(String[] args) {

		//main de la classe passowrd, hacemos un extend de Password
		//inicializamos el scnner para pedir la longitud de la contraseña
		Scanner sc = new Scanner(System.in);
		Password contraseña = new Password();
		System.out.print("Introduce la longitud de la contraseña:");
			int longitud=sc.nextInt();
		
		//llamamos al metodo y formateamos la salida por pantalla
		System.out.println("Contraseña de "+longitud+" generada: "+contraseña.generarCon(longitud));
		
		
	}

}
