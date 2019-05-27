package punto4;

public class Distancia 
{
	private double valor = 0.0f;
	
	public Distancia() 
	{
		valor = 0.0f;
	}

	public double setValor(double recorrido, int opcion) 
	{
		switch(opcion)
		{
		case 1:
			valor = recorrido;
			break;
		case 2:
			valor = recorrido * 1000;
			break;
		case 3:
			valor = recorrido * 0.01;
			break;
		}
		return valor;
	}
	
	public double getValor() 
	{
		return valor;
	}
}
