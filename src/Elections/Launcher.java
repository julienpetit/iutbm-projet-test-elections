package Elections;

import java.util.Set;

public class Launcher {

    public static void main(String[] args) {

        if (args.length != 3) {
            throw new RuntimeException("usage: java Election numberOfCandidate numberOfVotant numberPostes");
        }
        Set<Candidat> candidats;
        Set<Votant> votants;

        int nbCandidats = Integer.parseInt(args[0]);
        int nbVotant = Integer.parseInt(args[1]);
        int nbPostes= Integer.parseInt(args[2]);

        new Election(nbCandidats, nbVotant, nbPostes).ouvertureBureaux();
    }

}
