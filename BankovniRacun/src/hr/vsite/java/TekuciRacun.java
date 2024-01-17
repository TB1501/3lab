package hr.vsite.java;

public class TekuciRacun extends BankovniRacun
{
    private double dozvoljeniMinus;
    private double kamata;

    TekuciRacun(String brojRacuna, Vlasnik vlasnik, double dozvoljeniMinus, double kamata)
    {
        super(brojRacuna,vlasnik);
        this.dozvoljeniMinus=dozvoljeniMinus;
        this.kamata=kamata;
    }

    @Override
    public boolean Isplata(Promet p)
    {
        if ((getTrenutnoStanje() - p.getIsplata()) > -dozvoljeniMinus) {
            trenutnoStanje -= p.getIsplata();
            promet.add(p);
            System.out.println("Uspješna isplata");
            return true;
        } else {
            System.out.println("Neuspješna isplata");
            return false;
        }
    }

    double ObracunKamate()
    {
        if(getTrenutnoStanje()>=0)
        {
            double stanje=getTrenutnoStanje();
            Promet p1 =Promet.setIsplata(stanje, "HRK");
            Isplata(p1);
            stanje=Math.round((stanje*(1+kamata/100.0)));
            Promet p2 = Promet.setUplata(stanje,"HRK");
            Uplata(p2);
            return stanje;

        }
        else
        {
            double stanje=getTrenutnoStanje()*-1;
            Promet p1 =Promet.setUplata(stanje, "HRK");
            Uplata(p1);
            stanje=Math.round((stanje*(1+kamata/100.0)));
            Promet p2 = Promet.setIsplata(stanje,"HRK");
            Isplata(p2);
            return stanje;

        }
    }

}
