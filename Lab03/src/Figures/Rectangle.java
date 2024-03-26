package Figures;

public class Rectangle {
    private double a;
    private double b;

    private String name;

    public void setA(double a) {
        this.a = a;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    private double obwod(double a, double b){
        return a*2+b*2;
    }
    private  double pole (double a ,double b){
        return a*b;
    }

    public void view(){
        System.out.format("Figura %s, bok a %.2f, bok b %.2f, pole:%.2f, obwod:%.2f",name,a,b,pole(a,b),obwod(a,b));
    }
}
