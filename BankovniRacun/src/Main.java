import hr.vsite.java.BankovniRacun;
import hr.vsite.java.Orocenje;
import hr.vsite.java.Promet;
import hr.vsite.java.Vlasnik;

public class Main {
    public static void main(String[] args)
    {
        Vlasnik v1=new Vlasnik(1,"Ivo","Ivić","Maksimir 22");
        Vlasnik v2=new Vlasnik(2,"Mate","Matić","Maksimir 11");
        BankovniRacun b1=new BankovniRacun("1",v1);
        BankovniRacun b2=new BankovniRacun("2",v2);
        Promet p1= Promet.setUplata(100,"HRK");
        System.out.println(p1.toString());
        b1.Uplata(p1);
        System.out.println(b1.toString());
        Promet p2= Promet.setIsplata(90,"HRK");
        System.out.println(p2.toString());
        b2.Isplata(p2);
        System.out.println(b2.toString());
        BankovniRacun b3 = b1;
        System.out.println(b3.toString());
        Promet p3= Promet.setIsplata(100,"HRK");
        b3.Isplata(p3);
        System.out.println(b3.toString());
        BankovniRacun b4=new BankovniRacun("3",v1);
        Promet p4=Promet.setUplata(250,"HRK");
        b4.Uplata(p4);
        System.out.println(b4.toString());
        Promet p5 = Promet.setUplata(100,"HRK");
        Orocenje o = new Orocenje(200,"1",v1,0,10);
        o.Uplata(p5);




    }
}