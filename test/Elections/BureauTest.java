package Elections;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: julienpetit
 * Date: 6/1/12
 * Time: 6:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class BureauTest {

    @Test
    public void bureauElectionTest()
    {
        BureauElection be = new BureauElection();
    }


    @Test
    public void rempliUrneTest ()
    {

        int nbCandidats = 3;
        int nbVotant = 10;
        int nbPostes = 4;

        Set<Candidat> candidats;
        Set<Votant> votants;

        candidats = InitialiseElection.initialiseCandidats(nbCandidats);
        votants = InitialiseElection.initialiseVotants(nbVotant);

        Urne uneUrne = new Urne();
        for (Votant votant : votants) {
            uneUrne.avoter(votant.vote(candidats, nbPostes));
            votant.declareVote();
        }


        Urne lurne = BureauElection.rempliUrne(votants, candidats, nbPostes);


        // Test de la taille de l'urne
        Assert.assertTrue(uneUrne.vider().size() == lurne.vider().size());

        // Test des éléments de l'urne


    }
}
