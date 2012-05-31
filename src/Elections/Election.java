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

        candidats = InitialiseElection.initialiseCandidats(nbCandidats);
        votants = InitialiseElection.initialiseVotants(nbVotant);

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
}