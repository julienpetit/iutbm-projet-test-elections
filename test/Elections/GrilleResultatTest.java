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
        Candidat c1 = new Candidat("Hollande");
        Candidat c2 = new Candidat("Sarkozy");
        Candidat c3 = new Candidat("LePen");

        Set<Candidat> candidats = new HashSet<Candidat>();

        candidats.add(c1);
        candidats.add(c2);
        candidats.add(c3);

        GrilleResultat grilleResultat = new GrilleResultat(candidats);

        Bulletin b1 = new Bulletin();
        Bulletin b2 = new Bulletin();
        Bulletin b3 = new Bulletin();
        Bulletin b4 = new Bulletin();
        Bulletin b5 = new Bulletin();

        b1.addCandidat(c1);
        b2.addCandidat(c2);
        b2.addCandidat(c3);
        b3.addCandidat(c3);
        b4.addCandidat(c2);
        //b4.addCandidat(c1);
        b5.addCandidat(c2);

        List<Bulletin> bulletins = new ArrayList<Bulletin>();

        bulletins.add(b1);
        bulletins.add(b2);
        bulletins.add(b3);
        bulletins.add(b4);
        bulletins.add(b5);

        System.out.println(b1.getCandidats());
        System.out.println(b2.getCandidats());
        System.out.println(b3.getCandidats());
        System.out.println(b4.getCandidats());
        System.out.println(b5.getCandidats());

        grilleResultat.depouillement(bulletins);
        //System.out.println(grilleResultat.prepareAnnonce());

    }
}
