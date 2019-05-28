package punto5;

import java.util.Scanner;

public class Motorsito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int opcion = 0;
		
		Motor objetoMotor1 = new Motor();
		
		System.out.println(objetoMotor1.toString());
		objetoMotor1.setTipoBomba(300);
		objetoMotor1.setCombustible("Premium");
		objetoMotor1.setTipoFluido("Fluido 3000 4110 xRl");
		System.out.println(objetoMotor1.getTipoBomba());
		System.out.println(objetoMotor1.getTipoFluido());
		System.out.println(objetoMotor1.combustible());
		System.out.println(objetoMotor1.toString());
		
		System.out.println("Eliga el tipo del moto usando los numeros del 0 al 4.");
		opcion = teclado.nextInt();
		
		System.out.println(objetoMotor1.dimeTipoMotor(opcion));
	}

}
