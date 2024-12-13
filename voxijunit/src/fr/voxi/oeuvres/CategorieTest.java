package fr.voxi.oeuvres;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CategorieTest {

	@Test
	public void test() {
		Oeuvre oeuv1 = new Oeuvre( 1, "Monte-cristo");
		Oeuvre oeuv2 = new Oeuvre( 25, "Harry-potter");
		Oeuvre oeuv3 = new Oeuvre( 64, "Sisters");
		Oeuvre oeuv4 = new Oeuvre( 9, "Diablos");
		Oeuvre oeuv5 = new Oeuvre( 6, "Diablos");
		
		
		System.out.println();
		
		Assert.assertSame(oeuv4.getTitre(), oeuv5.getTitre());
		Assert.assertSame(oeuv2.getTitre(), oeuv5.getTitre());
	}
	


}
