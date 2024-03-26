package Figures;

public class Square {
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


    private double obwod(double a){
        return a*4;
    }
    private  double pole (double a){
        return a*a;
    }

    public void view(){
        System.out.format("Figura %s, bok pole:%.2f, obwod:%.2f",name,a,pole(a),obwod(a));
    }
}
