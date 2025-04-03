package produit;

public abstract class Produit implements IProduit {
	protected String nom;
	private Unite unite;
	
	@Override
	public String getNom() {
		return nom;
	}
	
	@Override
	public abstract void decrireProduit(IProduit produit);
	

}
