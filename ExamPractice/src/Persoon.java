/**
 * Created by Arthur on 12-6-2017.
 */
public class Persoon implements Comparable<Persoon>
{
    private String naam;
    private int geboorteJaar;
    private boolean isMan;

    public Persoon(String naam, int geboorteJaar, boolean isMan) {
        this.naam = naam;
        this.geboorteJaar = geboorteJaar;
        this.isMan = isMan;
    }

    public String getNaam()
    {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public int getGeboorteJaar()
    {
        return geboorteJaar;
    }

    public void setGeboorteJaar(int geboorteJaar)
    {
        this.geboorteJaar = geboorteJaar;
    }

    public boolean isMan()
    {
        return isMan;
    }

    public void setMan(boolean man)
    {
        isMan = man;
    }

    public boolean equals(Persoon vergelijking)
    {
        if(vergelijking.getGeboorteJaar() == geboorteJaar)
            if(vergelijking.getNaam().equals(naam))
                if(vergelijking.isMan() == isMan)
                    return true;
        return false;
    }

    @Override
    public int compareTo(Persoon other)
    {
        if(geboorteJaar < other.getGeboorteJaar())
            return other.geboorteJaar;
        return geboorteJaar;
    }
}
