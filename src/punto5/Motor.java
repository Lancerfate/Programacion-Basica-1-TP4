package punto5;

public class Motor 
{
	private int tipoBomba = 0;
	private String tipoFluido = "";
	private String combustible = "";
	private String mensaje = "";
	
	public Motor() 
	{
		tipoBomba = 500;
		tipoFluido = "Negro";
		combustible = "diesel";
	}
	
	public int setTipoBomba(int bomba)  //da valor al tipoBomba
	{
		return tipoBomba = bomba;
	}
	
	public String setTipoFluido(String fluido) //da valor al tipoFluido
	{
		return tipoFluido = fluido;
	}
	
	public String setCombustible(String tipoCombustible) //da valor al combustible
	{
		return combustible = tipoCombustible;
	}
	
	public int getTipoBomba() //devuelve el valor del tipoBomba
	{
		return tipoBomba;
	}
	public String getTipoFluido() //devuelve el valor del tipoFluido
	{
		return tipoFluido;
	}
	public String combustible() //devuelve el valor del combustible
	{
		return combustible;
	}
	
	public String dimeTipoMotor(int opcion) 
	{
		switch(opcion) 
		{
		case 0:
			mensaje = "No hay establecido un valor definido para el tipo de bomba.";
			break;
		case 1:
			mensaje = "La bomba es una bomba de agua.";
			break;
		case 2:
			mensaje = "La bomba es una bomba de gasolina.";
			break;
		case 3:
			mensaje = "La bomba es una bomba de hormigón.";
			break;
		case 4:
			mensaje = "La bomba es una bomba de pasta alimenticia.";
			break;
		default:
			mensaje = "No existe un valor válido para tipo de bomba.";
		}
		return mensaje;
	}
	
	public String toString() 
	{
		return ("El motor tiene una bomba " + tipoBomba + " , un fluido " + tipoFluido + " y un combustible de tipo " + combustible + ".");
	}
}
