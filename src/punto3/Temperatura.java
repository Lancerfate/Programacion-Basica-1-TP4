package punto3;

public class Temperatura 
{
	public double celsius = 0.0f;
	public double farenheit= 32f;
	public double kelvin = 273.15f;
	private double valor = 0.0f;
	
	public Temperatura() 
	{
		valor = 0.0f;
	}
	
	public double setValor(double grados, int opcion) 
	{
		switch(opcion)
		{
		case 1:
			valor = grados;
			break;
		case 2:
			valor = (5*(grados - farenheit))/9;
			break;
		case 3:
			valor = grados - kelvin;
			break;
		}
		return valor;
	}
	
	public double getValor() 
	{
		return valor;
	}
}
