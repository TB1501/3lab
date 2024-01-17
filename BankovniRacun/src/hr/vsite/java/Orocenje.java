package hr.vsite.java;

public class Orocenje extends BankovniRacun
{
    public Orocenje(double minus, String brojRacuna, Vlasnik vlasnik, double pocetnoStanje, double kamata)
    {
        super(brojRacuna,vlasnik);

    }

    @Override
    public boolean Uplata(Promet p)
    {
        System.out.println("Ne može se izvršit uplata na oročenje");
        return false;
    }
}
