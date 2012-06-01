package Elections;

import org.junit.Test;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: julienpetit
 * Date: 6/1/12
 * Time: 10:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElectionTest {

    @Test
    public void ouvertureBureauTest()
    {
        int nbCandidats = 3;
        int nbVotants = 100;
        int nbPostes = 4;

        Election election = new Election(nbCandidats, nbVotants, nbPostes);

        election.ouvertureBureaux();;
    }
}
