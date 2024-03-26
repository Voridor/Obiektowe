package Figures;

public class Cone {
    private double r;

    private double h;

    private double l;

    public void setH(double h) {
        this.h = h;
    }

    public double getH() {
        return h;
    }

    private String name;

    public void setR(double r) {
        this.r = r;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getR() {
        return r;
    }

    public String getName() {
        return name;
    }

    private double pole(double r){
        double temp = Math.pow(2,r)+Math.pow(2,h);
        l = Math.sqrt(temp);
        return Math.PI*Math.pow(2,r)+Math.PI*r*l;
    }

    private double obietosc(double r){
        return (1/3)*Math.PI*Math.pow(2,r);
    }

    public void view(){
        System.out.format("Bryła %s, promien %.2f, pole:%.2f, objetosc:%.2f",name,r,pole(r),obietosc(r));
    }
}
