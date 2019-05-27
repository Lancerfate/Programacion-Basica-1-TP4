package punto1;

public class Letra 
{
	char atributo = ' ';
	
	public Letra(char atributo) 
	{
		this.atributo = atributo;
	}
	
	public boolean esVocal() 
	{
		if(atributo == 'a' || atributo == 'e' || atributo == 'i' || atributo == 'o' || atributo == 'u') 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
