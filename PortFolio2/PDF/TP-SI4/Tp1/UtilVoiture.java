public class UtilVoiture
{
	public static void main(String[] args)
	{
		Voiture maVoiture;
		maVoiture = new Voiture();
		maVoiture.changerCouleur();
		maVoiture.TableauDeBord();
		maVoiture.accelerer();
		maVoiture.accelerer();
		maVoiture.TableauDeBord();
		maVoiture.decelerer();
		maVoiture.TableauDeBord();
		maVoiture.stopFeuRouge();
		maVoiture.ajouterKms();
		maVoiture.TableauDeBord();
		
	}
}