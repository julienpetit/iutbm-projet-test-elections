package Elections;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Maxime
 * Date: 18/05/12
 * Time: 14:45
 * To change this template use File | Settings | File Templates.
 */
public class CandidatTest {

    @Test
    public void TestCandidat(){
        // Candidat utilisé pour le test
        Candidat candidat = new Candidat("Hollande");

        // Test de l'attriut name
        Assert.assertEquals(candidat.toString(),"Hollande");

        // Test de la méthode equals
        Assert.assertFalse(candidat.equals(new Candidat("sarko")));
        Assert.assertTrue(candidat.equals(new Candidat("Hollande")));

        Assert.assertFalse(candidat.equals(new Integer(3)));  // Test de instanceof
    }
}
