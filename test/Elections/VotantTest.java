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
        int nbPostes = 2;
        Candidat candidat1 = new Candidat("Pierre");
        Candidat candidat2 = new Candidat("Paul");
        Candidat candidat3 = new Candidat("François");
        Candidat candidat4 = new Candidat("Nicolas");

        Set<Candidat> candidats = new HashSet<Candidat>();
        candidats.add(candidat1);
        candidats.add(candidat2);
        candidats.add(candidat3);
        candidats.add(candidat4);

        candidats.contains((votant.vote(candidats, nbPostes)).getCandidats());
    }

    @Test
    public void testGetVote()
    {
        Votant votant = new Votant(1);
        votant.declareVote();
        Assert.assertTrue(votant.getVote());
    }
}
