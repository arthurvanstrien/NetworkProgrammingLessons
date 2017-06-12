/**
 * Created by Arthur on 12-6-2017.
 */
public class Main {

    public static void main(String[] args)
    {
        new Main();
    }

    public Main()
    {
        Stamboom stamboom = testBoom();
        System.out.println("Aantal personen: " + stamboom.bepaalAantalMensen());
        System.out.println("Aantal vrouwen: " + stamboom.bepaalAantalVrouwen());
        System.out.println("Laatst geboren: " + stamboom.bepaalJongstePersoon());
    }

    public Stamboom testBoom()
    {
        Persoon janVvanNassau = new Persoon("Jan V van Nassau-Dillenburg", 1455, true);
        Persoon hendrikIII = new Persoon("Hendrik III van Nassau-Breda", 1483, true);
        Persoon reneVanChalon = new Persoon("René van Chalon", 1519, true);
        Persoon claudiaVanChalon = new Persoon("Claudia van Chalon", 1498, false);
        Persoon willemDeRijke = new Persoon("Willem I de Rijke", 1487, true);
        Persoon julianaVanStolberg = new Persoon("Juliana van Stolberg", 1506, false);
        Persoon willenVanOranje = new Persoon("Willem I van Oranje", 1533, true);
        Persoon annaVanBuren = new Persoon("Anna van Buren", 1533, false);
        Persoon annaVanSaksen = new Persoon("Anna van Saksen", 1544, false);
        Persoon charlotteVanBourbon = new Persoon("Charlotte van Bourbon", 1546, false);
        Persoon louiseDeColigny = new Persoon("Louise de Coligny", 1555, false);
        Persoon janVanNassau = new Persoon("Jan van Nassau", 1535, true);
        Persoon lodewijkVanNassau = new Persoon("Lodewijk van Nassau", 1538, true);
        Persoon hendrikVanNassau = new Persoon("Hendrik van Nassau", 1550, true);
        Persoon adolfVanNassau = new Persoon("Adolf van Nassau", 1540, true);
        Persoon maria = new Persoon("Maria", 1539, false);
        Persoon catharina = new Persoon("Catharina", 1543, false);


        Stamboom stamboom = new Stamboom(janVvanNassau);

        stamboom.voegKindToeAanPersoon(janVvanNassau, hendrikIII);
        stamboom.voegKindToeAanPersoon(hendrikIII, reneVanChalon);
        stamboom.voegKindToeAanPersoon(janVvanNassau, willemDeRijke);
        stamboom.voegKindToeAanPersoon(willemDeRijke, willenVanOranje);
        stamboom.voegKindToeAanPersoon(willemDeRijke, janVanNassau);
        stamboom.voegKindToeAanPersoon(willemDeRijke, lodewijkVanNassau);
        stamboom.voegKindToeAanPersoon(willemDeRijke, hendrikVanNassau);
        stamboom.voegKindToeAanPersoon(willemDeRijke, adolfVanNassau);
        stamboom.voegKindToeAanPersoon(willemDeRijke, maria);
        stamboom.voegKindToeAanPersoon(willemDeRijke, catharina);

        //stamboom.voegVrouwToe(reneVanChalon, claudiaVanChalon);
        //stamboom.voegVrouwToe(willemDeRijke, julianaVanStolberg);
        //stamboom.voegVrouwToe(willenVanOranje, louiseDeColigny);

        return stamboom;
    }
}
