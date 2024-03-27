import java.awt.*;

public class Kwadrat  extends Prostokat{

    double bok=0;

    Point point;

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }

    public Kwadrat(String kolor, double bok) {
        super(kolor, bok, bok);
    }
    
    public String opis(){
        System.out.println(super.opis()+"Bok: "+bok);
        return "";
    }
}
