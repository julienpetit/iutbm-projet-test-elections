package Elections;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: julienpetit
 * Date: 5/18/12
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class UrneTest {

    @Test
    public void Urnetest()
    {
        Urne uneUrne = new Urne();

        Bulletin unBulletin = new Bulletin();
        uneUrne.avoter(unBulletin);

        Assert.assertTrue(uneUrne.vider().contains(unBulletin));
    }
}
