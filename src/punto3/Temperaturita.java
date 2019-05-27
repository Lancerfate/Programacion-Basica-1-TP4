package punto3;

import java.util.Scanner;

public class Temperaturita 
{

	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		
		double temperaturaIngresada = 0.0f;
		double valorSalida = 0.0f;
		int opcionIngresada1 = 0;
		int opcionIngresada2 = 0;
		
		Temperatura objetoTemperatura = new Temperatura();
		
		
		System.out.println("Ingrese la temperatura que desea: ");
		temperaturaIngresada = teclado.nextFloat();
		
		System.out.println("Ingrese 1 si la temperatura que ingreso esta en celsius, 2 si esta en farenheit, 3 si esta en kelvin.");
		opcionIngresada1 = teclado.nextInt();
		objetoTemperatura.setValor(temperaturaIngresada, opcionIngresada1);
		
		System.out.println("Ingrese 1 si quiere el valor que ingreso en celsius, 2 si lo quiere en farenheit o 3 si lo quiere en kelvin.");
		opcionIngresada2 = teclado.nextInt();
		
		switch(opcionIngresada2)
		{
			case 1:
				System.out.println(objetoTemperatura.getValor() + "°C");
				break;
			case 2:
				valorSalida = ((9*(objetoTemperatura.getValor()))/5)+32;
				System.out.println(valorSalida + "°F");
				break;
			case 3:
				valorSalida = (objetoTemperatura.getValor()+ 273.15);
				System.out.println(valorSalida + "°K");
				break;
		}
		
		
	}

}
