package Elections;

public class Candidat {
    private final String name;

    public Candidat(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Candidat)
            return name.equals(((Candidat) o).toString());
        else
            return false;
    }

    @Override
    public int hashCode()
    {
        return this.name.hashCode();
    }
}
