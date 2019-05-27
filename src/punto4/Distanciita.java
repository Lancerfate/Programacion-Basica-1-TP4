package punto4;

import java.util.Scanner;

public class Distanciita {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double recorridoIngresado = 0.0f;
		double valorSalida = 0.0f;
		int opcionIngresada1 = 0;
		int opcionIngresada2 = 0;
		
		Distancia objetoDistancia = new Distancia();
		
		System.out.println("Ingrese una distancia: ");
		recorridoIngresado = teclado.nextDouble();
		
		System.out.println("Ingrese 1 si la distancia que ingreso esta en metros, 2 si esta en kilometros, 3 si esta en centimetros.");
		opcionIngresada1 = teclado.nextInt();
		objetoDistancia.setValor(recorridoIngresado, opcionIngresada1);
		
		System.out.println("Ingrese 1 si quiere el valor que ingreso en metros, 2 si lo quiere en Kilometros o 3 si lo quiere en centimetros.");
		opcionIngresada2 = teclado.nextInt();
		
		switch(opcionIngresada2) 
		{
		case 1:
			System.out.println(objetoDistancia.getValor() + "m.");
			break;
		case 2:
			valorSalida = (objetoDistancia.getValor() * 0.001);
			System.out.println(valorSalida + "Km.");
			break;
		case 3:
			valorSalida = (objetoDistancia.getValor() * 100);
			System.out.println(valorSalida + "");
			break;
		}

	}

}
