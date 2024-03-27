public class Okrag extends Figura{
    Punkt srodkeOkregu;

    double r;

    public double getPowierzchnia(){
        return Math.PI*Math.pow(r,2);
    }

    public double srednica(){ return 2*r;}

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void wSrodku(Punkt punkt){
        double lewaStrone = Math.pow(2,(punkt.getX() - srodkeOkregu.getX())) +
                Math.pow(punkt.getY()+punkt.getY(),2);
        double prawaStrona = Math.pow(r,2);
        if (lewaStrone <= prawaStrona) {
            System.out.format("\nPunkt o wspolrzednych (%.2f,%.2f), "+
                    "znajduje sie w okregu S = (%.2f,%.2f)"
                    , punkt.getX(),punkt.getY(),srodkeOkregu.getX(),srodkeOkregu.getY());
        }
    }

    public Okrag(double r) {
        this.srodkeOkregu.setX(0);
        this.srodkeOkregu.setY(0);
        this.r =0;
    }
}
