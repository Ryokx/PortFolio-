
class Helico
{
	private int altitude;
	
	public Helico()
	{
		// initialiser l'altitude � 0
		........................
	}
	
	public void decoller()
	{
		//D�coller � 12 m du sol
		........................
	}
	
	public void atterir()
	{
		//att�rir
		........................
	}
	
	public void monter()
	{
		....................

		........................
		// poser la question de combien de m�tre monter
		// r�cup�rer la valeur 
		// monter en fonction de la valeur.
	}
	
	public void descendre()
	{
		....................
           ........................
		// poser la question de combien de m�tre descendre
		// r�cup�rer la valeur 
		// descendre en fonction de la valeur.
	}
	
	public void bouton_rouge()
	{
		afficher("T'as pris ton parachute?");
		System.out.println("5");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("4");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("3");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("2");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("1");
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Ejection!");
		
	}
	
	public void tableauDeBord()
	{
		afficher("Bienvenue dans Supercopter")
............................................
		afficher("Nous volons � une altitude de " , altitude , " m��tres")
........................................................................................
		afficher("Bon vol")
........................................................................................
	}
}
