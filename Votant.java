import java.util.Set;
import java.util.ArrayList;

public class Votant {

    private boolean aVoté;
    private int numeroOrdre;


    public Votant(int numeroOrdre) {
        this.aVoté = false;
        this.numeroOrdre = numeroOrdre;
    }

    public Bulletin vote(Set<Candidat> candidats, int nbPostes) {
        Bulletin bulletin = new Bulletin();
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
}
