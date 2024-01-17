package hr.vsite.java;

public class Promet
{

    private double uplata;
    private double isplata;
    private String valuta;

    public Promet(double uplata, double isplata, String valuta)
    {
        this.uplata=uplata;
        this.isplata=isplata;
        this.valuta=valuta;

        if(uplata!=0&&isplata!=0)
        {
            try
            {
                throw new Exception("Greška u obradi");
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        }

    }

    public static Promet setUplata(double iznosUplate, String valutaUplate)
    {
        Promet p=new Promet(iznosUplate,0,valutaUplate);

        return p;

    }

    public static Promet setIsplata(double iznosIsplate, String valutaIsplate)
    {
        return new Promet(0, iznosIsplate, valutaIsplate);
    }

    public double getUplata(){return uplata;}
    public double getIsplata(){return isplata;}

    public String toString()
    {
        return "Promet[uplata="+uplata+",isplata="+isplata+",valuta="+valuta+"]";
    }


}
