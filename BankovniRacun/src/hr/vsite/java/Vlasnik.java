package hr.vsite.java;

public class Vlasnik
{
    private double oib;
    private String name;
    private String lastName;
    private String adress;

    public Vlasnik(double oib, String name, String lastName, String adress)
    {
        this.oib=oib;
        this.name=name;
        this.lastName=lastName;
        this.adress=adress;

    }



    public void setOib(double o){oib=o;}
    public double getOib(){return oib;}
    public void setName(String n){name=n;}
    public String getName(){return name;}
    public void setLastName(String l){lastName=l;}
    public String getLastName(){return lastName;}
    public void setAdress(String a){adress=a;}
    public String getAdress(){return adress;}
}
