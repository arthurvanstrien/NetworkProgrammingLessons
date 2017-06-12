import java.util.ArrayList;

/**
 * Created by Arthur on 12-6-2017.
 */
public class Stamboom
{
    private Persoon ouder;
    private Persoon getrouwdMet;
    private ArrayList<Stamboom> kinderen;

    public Stamboom (Persoon ouder)
    {
        this.ouder = ouder;
        this.kinderen = new ArrayList<Stamboom>();
    }

    public boolean voegKindToeAanPersoon(Persoon ouder, Persoon kind)
    {
        if(this.ouder.equals(ouder))
        {
            kinderen.add(new Stamboom(kind));
            return true;
        }
        else
        {
            for (Stamboom geselecteerdKind : kinderen) {
                if (geselecteerdKind.voegKindToeAanPersoon(ouder, kind))
                    return true;
            }
        }
        return false;
    }

    public boolean voegVrouwToe(Persoon man, Persoon vrouw)
    {
        if(this.ouder.equals(man))
        {
            this.getrouwdMet = vrouw;
            return true;
        }
        else
        {
            for (Stamboom geselecteerdKind : kinderen) {
                if (geselecteerdKind.voegVrouwToe(ouder, vrouw))
                    return true;
            }
        }
        return false;
    }

    public int bepaalAantalMensen()
    {
        int aantalMensen = 0;

        //Huidige persoon bij op tellen
        aantalMensen++;

        for(Stamboom kind : kinderen)
        {
            //Voor de kinderen hieronder op te vragen.
            aantalMensen += kind.bepaalAantalMensen();
        }

        if(getrouwdMet != null)
            aantalMensen++;

        return aantalMensen;
    }

    public int bepaalAantalVrouwen()
    {
        int aantalVrouwen = 0;

        //Als deze "ouder" een vrouw is tellen we er één bij op.
        if(!ouder.isMan())
        {
            aantalVrouwen++;
        }

        for(Stamboom kind : kinderen)
        {
            //Voor de kinderen hieronder op te vragen.
            aantalVrouwen += kind.bepaalAantalVrouwen();
        }

        if(getrouwdMet != null)
            aantalVrouwen++;

        return aantalVrouwen;
    }

    public int bepaalJongstePersoon()
    {
        int jongste = ouder.getGeboorteJaar();
        for(Stamboom kind : kinderen)
        {
            jongste = ouder.compareTo(kind.getPersoon());
        }
        return jongste;
    }

    public Persoon getPersoon()
    {
        return ouder;
    }
}
