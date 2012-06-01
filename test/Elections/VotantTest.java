package Elections;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: julienpetit
 * Date: 5/18/12
 * Time: 3:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class VotantTest {


    @Test
    public void testVote()
    {
        Votant votant = new Votant(1);
        int nbPostes = 3;
        Candidat candidat1 = new Candidat("Pierre");

        Set<Candidat> candidats = new HashSet<Candidat>();
        candidats.add(candidat1);

        Assert.assertTrue((votant.vote(candidats, nbPostes)).getCandidats().contains(candidats.toArray()[0]));
    }

    @Test
    public void testGetVote()
    {
        Votant votant = new Votant(1);
        votant.declareVote();
        Assert.assertTrue(votant.getVote());
    }

    @Test
    public void testEquals()
    {
        int nbCandidats = 3;
        int nbVotants = 100;
        int nbPostes = 4;

        Election election = new Election(nbCandidats, nbVotants, nbPostes);

        Votant votant = new Votant(0);

        Assert.assertEquals(votant, new Votant(0));
        Assert.assertFalse(votant.equals(new Votant(1)));
        Assert.assertFalse(votant.equals(new Integer(2)));

    }
}