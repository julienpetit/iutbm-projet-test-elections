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
    public void CandidatTest(){
        Candidat candidat = new Candidat("Hollande");
        Assert.assertEquals(candidat.toString(),"Hollande");
    }
}
