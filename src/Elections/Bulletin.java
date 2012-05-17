package Elections;

import java.util.Set;
import java.util.HashSet;

public class Bulletin {

    private Set<Candidat> candidats = new HashSet<Candidat>();

    public void addCandidat(Candidat candidat) {
        candidats.add(candidat);
    }

    public Set<Candidat> getCandidats() {
        return candidats;
    }
}
