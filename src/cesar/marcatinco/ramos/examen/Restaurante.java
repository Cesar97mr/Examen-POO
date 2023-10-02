package cesar.marcatinco.ramos.examen;

import java.util.Scanner;

public class Restaurante {
	private String nombre;
	
	public static void main(String[] args) {
		
		//Comenzamos creando los objetos de cada clase requerida
		Plato p1 = new Plato("tortilla", 7.5, true);
		Plato p2 = new Plato("berenjeas", 4.5, true);
		Plato p3 = new Plato("solomillo", 27.5, true);
		Plato p4 = new Plato("albondigas", 9.5, true);
		Plato p5 = new Plato("paella", 17.5, false);
	
		Bebida b1 = new Bebida("refresco", 2.5);
		Bebida b2 = new Bebida("agua", 2);
		
		//Creamos un array de Plato llamado comidas que sera nuestros platos que formen el turno de comidas 
		Plato [] comidas = {p1,p3,p5};
		
		//Creamos otro array de Plato llamado cenas que sera nuestros platos que formen el turno de cenas 
		Plato [] cena = {p5,p2};
		
		//Hacemos lo mismo con nuestra seccion de bebidas
		Bebida [] bebidas = {b1};
		
		//Creamos nuestras 2 cartas apartir de los tipos de menu creados anteriormente
		Carta c1 = new Carta("Comidas", comidas, bebidas);
		Carta c2 = new Carta("Cenas", cena, bebidas );
		
		//Creamos un array de cartas para poder dar al usuario varias opciones a la hora de elegir una carta 
		Carta [] cartas = {c1,c2};
		
		// Creamos un objeto principal de nuestra clase principal para poder llamar a los métodos, 
		// Los cuales trabajarán y manipularán los objetos creados anteriormente
		Restaurante r1 = new Restaurante();
		
		/** PARA UNA MEJOR VISUALIZACIÓN DE LOS MÉTODOS, EJECUTARLOS UNO A UNO !!
		 * 
		 */
		
		// Comprobamos nuestro método mostrarCarta() pasando como argumento una de las cartas
		// que habremos creado anteriormente
		r1.mostrarCarta(c1);
		r1.mostrarCarta(c2);
		
		// Comprobamos el método elegirCarta() el cual le pasaremos como argumento el array de Cartas previamente creado 
		r1.elegirCarta(cartas);
		
		//Finalmente el método importesCarta() llamará al método elegirCarta para que nos devuelva,
		// la carta seleccionada por el cliente entre el array de cartas y mostraremos el precio y los productos de esta.
		r1.importesCarta(r1.elegirCarta(cartas));
	}
	
	public void mostrarCarta(Carta cartas) {
		System.out.println("Platos disponibles de la carta: " + cartas.getNombre());
		System.out.println("### Platos ###");
		for(int i = 0; i<cartas.getPlatos().length; i++) {
			if(cartas.getPlatos()[i].isDisponible() == true) {
				System.out.println(cartas.getPlatos()[i].getNombre() + "  -----> " + 
						   cartas.getPlatos()[i].getPrecio());
			}
		}
	}
	public Carta elegirCarta(Carta [] cartas) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<cartas.length;i++) {
			System.out.println("Carta " + (i+1) + " :" + cartas[i].getNombre());
		}
		System.out.println("Porfavor elige una carta: ");
		int valor = sc.nextInt();
		System.out.println("Has elegido la carta: " + valor);
		
		return cartas[valor - 1];
	}
	public void importesCarta(Carta carta) {
		
	System.out.println("Importes de los productos de la carta: " + carta.getNombre());
	System.out.println("");
	System.out.println("### Platos ###");
	for(int i = 0; i<carta.getPlatos().length;i++) {
		if(carta.getPlatos()[i].isDisponible() == false) {
			System.out.println(carta.getPlatos()[i].getNombre() + "  -----> " + 
					   carta.getPlatos()[i].getPrecio()  + "  --> " + "(No disponible)");
		}else{
			System.out.println(carta.getPlatos()[i].getNombre() + "  -----> " + 
					   carta.getPlatos()[i].getPrecio());
		}
		
	}
	System.out.println("");
	System.out.println("### Bebidas ###");
	for(int j = 0; j<carta.getBebida().length; j++) {
		System.out.println(carta.getBebida()[j].getNombre() + " ----> " + 
						   carta.getBebida()[j].getPrecio());
		
		}
	}
	
}
