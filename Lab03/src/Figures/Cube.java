package Figures;

public class Cube {

    private double a;

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


    private double objetosc(double a){
        return a*a*a;
    }
    private  double pole (double a){
        return a*a*6;
    }

    public void view() {
        System.out.format("Bryła %s, bok pole:%.2f, objetosc:%.2f", name, a, pole(a), objetosc(a));
    }
}
