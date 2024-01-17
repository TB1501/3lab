package hr.vsite.java;

public class PravnaOsoba
{
    private double OIB;
    private String naziv;
    private String adresa;
    private Vlasnik vlasnik;

    PravnaOsoba(double OIB, String naziv, String adresa, Vlasnik vlasnik)
    {
        this.OIB=OIB;
        this.naziv=naziv;
        this.adresa=adresa;
        this.vlasnik=vlasnik;
    }



}
