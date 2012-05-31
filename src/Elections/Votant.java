package Elections;

import java.util.Set;
import java.util.ArrayList;

public class Votant {

    private boolean aVoté;   // Attribut est assigné mais jamais utilisé
    private int numeroOrdre;  // Attribut est assigné mais jamais utilisé


    public Votant(int numeroOrdre) {
        this.aVoté = false;
        this.numeroOrdre = numeroOrdre;
    }

    public Bulletin vote(Set<Candidat> candidats, int nbPostes) {

        Bulletin bulletin = new Bulletin();

        if(nbPostes < 0) return bulletin; // Ajout

        ArrayList<Candidat> candidatsAsList = new ArrayList<Candidat>(candidats);

        for (int i = 0; i < nbPostes; i++) {
            Candidat candidat = candidatsAsList.get((int) (Math.random() * candidats.size()));
            bulletin.addCandidat(candidat);
        }

        return bulletin;
    }

    public void declareVote() {
        aVoté = true;
    }


    public boolean getVote()
    {
        return aVoté;
    }
}