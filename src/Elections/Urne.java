package Elections;

import java.util.List;
import java.util.ArrayList;

public class Urne {

    private List<Bulletin> lesBulletins = new ArrayList<Bulletin>();

    public void avoter(Bulletin bulletin) {
        lesBulletins.add(bulletin);
    }

    public List<Bulletin> vider() {
        return lesBulletins;
    }
}
