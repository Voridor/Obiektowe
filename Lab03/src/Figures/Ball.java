package Figures;

public class Ball {
    private double r;

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
        return Math.PI*Math.pow(2,r)*4;
    }

    private double obietosc(double r){
        return (3/4)*Math.PI*Math.pow(3,r);
    }

    public void view(){
        System.out.format("Bryła %s, promien %.2f, pole:%.2f, objetosc:%.2f",name,r,pole(r),obietosc(r));
    }
}
