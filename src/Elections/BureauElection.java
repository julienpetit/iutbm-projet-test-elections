package Elections;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: julienpetit
 * Date: 6/1/12
 * Time: 6:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class BureauElection {


    public static Urne rempliUrne(Set<Votant> votants, Set<Candidat> candidats, int nbPostes)
    {
        Urne lurne = new Urne();
        for (Votant votant : votants) {
            lurne.avoter(votant.vote(candidats, nbPostes));
            votant.declareVote();
        }
        return lurne;
    }
}
