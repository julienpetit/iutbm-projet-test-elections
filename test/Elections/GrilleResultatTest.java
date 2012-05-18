package Elections;

import org.junit.Test;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Maxime
 * Date: 18/05/12
 * Time: 15:15
 * To change this template use File | Settings | File Templates.
 */
public class GrilleResultatTest{

    @Test
    public void GrilleResultatTest(){
        Candidat candidat1 = new Candidat("Hollande");
        Candidat candidat2 = new Candidat("Sarkozy");
        Candidat candidat3 = new Candidat("LePen");
        Set<Candidat> candidats = new HashSet<Candidat>();
        candidats.add(candidat1);
        candidats.add(candidat2);
        candidats.add(candidat3);

        GrilleResultat grilleResultat = new GrilleResultat(candidats);

        List<Bulletin> bulletins = new ArrayList<Bulletin>();




    }
}
