package Elections;

import java.util.*;

public class GrilleResultat {

    private Map<Candidat, Integer> resultat;

    public GrilleResultat(Set<Candidat> candidats) {
        this.resultat = new HashMap<Candidat, Integer>();    // Ajouté
        for (Candidat candidat : candidats) {
            resultat.put(candidat, 0);
        }
    }

    public void depouillement(List<Bulletin> bulletins) {
        for (Bulletin bulletin : bulletins) {
            for (Candidat candidat : bulletin.getCandidats()) {
                int score = resultat.get(candidat);
                resultat.put(candidat, score + 1);
            }
        }
    }

    public SortedSet<Map.Entry<Candidat,Integer>> prepareAnnonce() {

        //Tri des résultats
        SortedSet<Map.Entry<Candidat,Integer>> annonces = new TreeSet<Map.Entry<Candidat,Integer>>(new Comparator<Map.Entry<Candidat, Integer>>() {
            public int compare(Map.Entry<Candidat, Integer> o1, Map.Entry<Candidat, Integer> o2) {
                int compare = o2.getValue().compareTo(o1.getValue());
                // On traite dans le cas ou deux candidats ont le même score
                if (compare == 0){
                    // On compare les deux clés (nom du candidat) pour garder tout les candidats qui ont le même score
                    if (!o2.getKey().equals(o1.getKey()))
                        compare = -1;
                }
                return compare;
            }
        });
        annonces.addAll(resultat.entrySet());
        return annonces;
    }

    public Map<Candidat, Integer> getResultat(){
        return resultat;
    }
}
