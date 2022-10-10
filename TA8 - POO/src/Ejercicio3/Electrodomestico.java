package Ejercicio3;

public class Electrodomestico {
	//Constantes
	protected final static double PRECIOBASE=100;
	protected final static String COLOR="Blanco";
	protected final static char CONSUMOE='F';
	protected final static double PESO=5.0;
	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoE;
	protected double peso;
	
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoE = CONSUMOE;
		this.peso = PESO;
	}

	//Constructor con precio base y peso como parametro 
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoE = CONSUMOE;
		this.peso = peso;
	}

	//dentro del construcor añadimos una condicion que, si devuelve true cogerá el valor pasado por parametro sino cogera el valor default
	public Electrodomestico(double precioBase, String color, char consumoE, double peso) {
		this.precioBase = precioBase;
		//condicion para que cuando retorne el metodo imprima el atributo con el color indicado o si no es correcto imprime la constante
		if (filtroColores(color)) {
			this.color = color;
		}else {
			this.color = COLOR;
		}
		//condicion para que cuando retorne el metodo imprima el atributo con el consumoE indicado(y lo imprime si 
		//o si en mayusuculas o si no es correcto imprime la constante
		if (filtroConsumoEnergetico (Character.toUpperCase(consumoE))) {
			this.consumoE = Character.toUpperCase(consumoE);		
		}else {
			this.consumoE = CONSUMOE;
		}
		
		this.peso = peso;
	}


	//getters y setters
	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public char getConsumoE() {
		return consumoE;
	}


	public void setConsumoE(char consumoE) {
		this.consumoE = consumoE;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//sobreescribimos el toString para imprimir por pantalla los objetos
	@Override
	public String toString() {
		return "Precio base: "+this.precioBase + "\nColor: "+this.color+"\nConsume Eléctrico: "+ this.consumoE+"\nPeso: "+this.peso;
	
	}
	
	//metodo para comprobar los colores y ponerlo como minuscula
	public static boolean filtroColores(String color) {
		color.toLowerCase();
		boolean colorBueno=false;
		
		switch (color) {
			case "blanco":
				colorBueno=true;
				return colorBueno;
			case "negro":
				colorBueno=true;
				return colorBueno;
			case "rojo":
				colorBueno=true;
				return colorBueno;
			case "azul":
				colorBueno=true;
				return colorBueno;
			case "gris":
				colorBueno=true;
				return colorBueno;
			default:
				return colorBueno;
		}
	}
		
		//metodo para comprobar los caracteres de consumo energetico y ponerlo como minuscula
		public static boolean filtroConsumoEnergetico(char consumoE) {
			Character.toUpperCase(consumoE);
			boolean valorEnergeticoBueno=false;
			
			switch (consumoE) {
				case 'A':
					valorEnergeticoBueno=true;
					return valorEnergeticoBueno;
				case 'B':
					valorEnergeticoBueno=true;
					return valorEnergeticoBueno;
				case 'C':
					valorEnergeticoBueno=true;
					return valorEnergeticoBueno;
				case 'D':
					valorEnergeticoBueno=true;
					return valorEnergeticoBueno;
				case 'E':
					valorEnergeticoBueno=true;
					return valorEnergeticoBueno;
				case 'F':
					valorEnergeticoBueno=true;
					return valorEnergeticoBueno;
				default:
					return valorEnergeticoBueno;
			}
		}
	
}
