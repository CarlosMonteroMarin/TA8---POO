package Ejercicio3;

public class mainElectrodomesticoApp extends Electrodomestico{

	public static void main(String[] args) {
		
		Electrodomestico secadora = new Electrodomestico();
		Electrodomestico nevera = new Electrodomestico(253, 700);
		Electrodomestico lavadora = new Electrodomestico(350,"blanco", 'a', 6);
		
		System.out.println(secadora);
		System.out.println();
		System.out.println(nevera);
		System.out.println();
		System.out.println(lavadora);
		
	}
}
