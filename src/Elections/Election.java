package Elections;

import java.util.*;

public class Election {
    private final int nbCandidats;
    private final int nbVotant;
    private final int nbPostes;

    public Election(int nbCandidats, int nbVotant, int nbPostes) {
        this.nbCandidats = nbCandidats;
        this.nbVotant = nbVotant;
        this.nbPostes = nbPostes;
    }

    public void ouvertureBureaux() {
        Set<Candidat> candidats;
        Set<Votant> votants;

        candidats = initialiseCandidats(nbCandidats);
        votants = initialiseVotants(nbVotant);

        //Votes
        Urne lurne = new Urne();
        for (Votant votant : votants) {
            lurne.avoter(votant.vote(candidats, nbPostes));
            votant.declareVote();
        }

        //Dépouillement
        GrilleResultat resultat = new GrilleResultat(candidats);
        resultat.depouillement(lurne.vider());
        SortedSet<Map.Entry<Candidat,Integer>> annonces = resultat.prepareAnnonce();

        for (Map.Entry<Candidat, Integer> annonce : annonces) {
            System.out.println(annonce.getKey()+" "+ annonce.getValue()+ "\n");
        }
    }

    private static Set<Votant> initialiseVotants(int nbVotant) {
        Set<Votant> votant = new HashSet<Votant>();
        for (int i = 0; i < nbVotant; i++) {
            votant.add(new Votant(i));
        }
        return votant;
    }

    private static Set<Candidat> initialiseCandidats(int nbCandidats) {
        Set<Candidat> candidats = new HashSet<Candidat>();
        for (int i = 0; i < nbCandidats; i++) {
            candidats.add(new Candidat("candidat" + i));
        }
        return candidats;
    }

}
