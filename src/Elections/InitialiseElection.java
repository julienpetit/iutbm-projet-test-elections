package Elections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: julienpetit
 * Date: 5/30/12
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class InitialiseElection {

    public static Set<Votant> initialiseVotants(int nbVotant) {
        Set<Votant> votant = new HashSet<Votant>();
        for (int i = 0; i < nbVotant; i++) {
            votant.add(new Votant(i));
        }
        return votant;
    }

    public static Set<Candidat> initialiseCandidats(int nbCandidats) {
        Set<Candidat> candidats = new HashSet<Candidat>();
        for (int i = 0; i < nbCandidats; i++) {
            candidats.add(new Candidat("candidat" + i));
        }
        return candidats;
    }
}