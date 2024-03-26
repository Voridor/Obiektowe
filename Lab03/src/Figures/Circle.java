package Figures;

public class Circle {
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
        return Math.PI*Math.pow(2,r);
    }

    private double obwod(double r){
        return 2*Math.PI*r;
    }

    public void view(){
        System.out.format("FiguraL %s, promien %.2f, pole:%.2f, obwod:%.2f",name,r,pole(r),obwod(r));
    }
}
