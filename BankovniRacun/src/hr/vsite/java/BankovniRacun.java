package hr.vsite.java;


import java.util.LinkedList;
import java.util.List;

public class BankovniRacun
{
    protected String brojRacuna;
    protected Vlasnik vlasnik;
    protected double pocetnoStanje;
    protected double trenutnoStanje;

    List<Promet> promet= new LinkedList<Promet>();

    public BankovniRacun(String brojRacuna, Vlasnik vlasnik)
    {
        this.brojRacuna=brojRacuna;
        this.vlasnik=vlasnik;
        this.pocetnoStanje=0.0;


    }

    public String getBrojRacuna(){return brojRacuna;}
    public Vlasnik getVlasnik(){return vlasnik;}
    public double getPocetnoStanje(){return pocetnoStanje;}
    public double getTrenutnoStanje(){return trenutnoStanje;}

    public boolean Uplata(Promet p)
    {
        trenutnoStanje += p.getUplata();
        promet.add(p);
        System.out.println("Provedena uplata");
        return true;
    }

    public boolean Isplata(Promet p)
    {
        if(trenutnoStanje<p.getIsplata())
        {
            System.out.println("Nemože se izvršit isplata");
            return false;
        }
        else
        {
            trenutnoStanje -= p.getIsplata();
            promet.remove(p);
            System.out.println("Provedena isplata");
            return true;
        }
    }

    /*@Override
    public String toString()
    {
        return promet.toString();

    }*/


}
