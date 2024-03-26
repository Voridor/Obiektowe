package Figures;

public class Cuboid {
    private double a;

    private double b;

    private double c;

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

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


    private double objetosc(double a, double b, double c){
        return a*b*c;
    }
    private  double pole (double a){
        return a*c*2+a*b*2+b*c*2;
    }

    public void view(){
        System.out.format("Bryła %s, bok pole:%.2f, objetosc:%.2f",name,a,pole(a),objetosc(a,b,c));
    }
}
