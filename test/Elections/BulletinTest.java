package Elections;

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
        Bulletin unBulletin = new Bulletin();

        Candidat unCandidat = new Candidat("Hollande");
        unBulletin.addCandidat(unCandidat);
        Assert.assertTrue(unBulletin.getCandidats().contains(unCandidat));
    }

}
