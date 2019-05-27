package punto2;

public class Dia 
{
	private char domingo = ' ';
	private char lunes = ' ';
	private char martes = ' ';
	private char miercoles = ' ';
	private char jueves = ' ';
	private char viernes = ' ';
	private char sabado = ' ';
	private String uno = "Domingo";
	private String dos = "Lunes";
	private String tres = "Martes";
	private String cuatro = "Miercoles";
	private String cinco = "Jueves";
	private String seis = "Viernes";
	private String siete = "Sabado";
	private String resultadoDia = " ";
	
	public Dia() 
	{
		domingo = '1';
		lunes = '2';
		martes = '3';
		miercoles = '4';
		jueves = '5';
		viernes = '6';
		sabado = '7';
		
	}
	
	public String queDia(char dia) 
	{
		if(dia == domingo) 
		{
			return resultadoDia = uno;
		}
		else if(dia == lunes)
		{
			return resultadoDia = dos;
		}
		else if(dia == martes) 
		{
			return resultadoDia = tres;
		}
		else if (dia == miercoles) 
		{
			return resultadoDia = cuatro;
		}
		else if (dia == jueves) 
		{
			return resultadoDia = cinco;
		}
		else if (dia == viernes) 
		{
			return resultadoDia = seis;
		}
		else if (dia == sabado) 
		{
			return resultadoDia = siete;
		}
		return resultadoDia;
	}
}
