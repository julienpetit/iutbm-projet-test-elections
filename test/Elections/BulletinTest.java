package Elections;

import com.sun.source.tree.AssertTree;
import junit.framework.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: julienpetit
 * Date: 5/18/12
 * Time: 3:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class BulletinTest {

    @Test
    public void testBulletin()
    {
        // Test méthode vraie
        Bulletin unBulletin = new Bulletin();

        Candidat unCandidat = new Candidat("Hollande");
        unBulletin.addCandidat(unCandidat);
        Assert.assertTrue(unBulletin.getCandidats().contains(unCandidat));


        // Test méthode fausse
        Bulletin un2emeBulletin = new Bulletin();

        Candidat un2emeCandidat = new Candidat("Sarko");
        un2emeBulletin.addCandidat(un2emeCandidat);
        Assert.assertFalse(un2emeBulletin.getCandidats().contains(unCandidat));
    }

}
