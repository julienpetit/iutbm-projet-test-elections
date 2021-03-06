package Elections;

import junit.framework.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: julienpetit
 * Date: 5/17/12
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class InitialiseElectionTest {


    @Test
    public void testInitialiseElection()
    {
        InitialiseElection ie = new InitialiseElection();
    }

    @Test
    public void testInitialiseCandidats()
    {
        int nbCandidats = 3;
        int nbVotants = 100;
        int nbPostes = 4;

        Set<Candidat> candidats = InitialiseElection.initialiseCandidats(nbCandidats);

        for (int i = 0; i < nbCandidats; i++) {
            String name = "candidat" + i;
            Assert.assertTrue(candidats.contains(new Candidat(name)));
        }
    }

    @Test
    public void testInitialiseVotants()
    {
        int nbCandidats = 3;
        int nbVotants = 100;
        int nbPostes = 4;

        Set<Votant> votants = InitialiseElection.initialiseVotants(nbVotants);

        for (int i = 0; i < nbVotants; i++) {
            Assert.assertTrue(votants.contains(new Votant(i)));
        }
    }
}