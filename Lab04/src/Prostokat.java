
class Prostokat extends Figura {
    double wys=0, szer=0;

    Punkt punkt = new Punkt(0,0);


    public Prostokat(String kolor, double wys, double szer) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    public String opis(){
        String a = super.opis();
        System.out.println(a+"Wys: "+wys+" Szer: "+szer );
        return "";
    }
}