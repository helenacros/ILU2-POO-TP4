package villagegaulois;

import personnages.Gaulois;

public interface IVillage {
	<P extends Produit> boolean installerVendeur(IEtal etal, Gaulois vendeur, P[] produit, int prix);

	void acheterProduit(String produit, int quantiteSouhaitee);
}
