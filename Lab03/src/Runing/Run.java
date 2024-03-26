package Runing;

import Figures.*;

public class Run {

    Input intput = new Input();

    public void runing(){
        int wybor;
        while (true){
            Menu();
            wybor = intput.inputInt();
            switch (wybor){
                case 1 -> viewCirlcle();
                case 2 -> viewSquare();
                case 3 -> viewRecangle();
                case 4 -> viewCube();
                case 5 -> viewCuboid();
                case 6 -> viewBall();
                case 7 -> viewCone();
                case 8 -> Close();
                default -> defaultInstruction();
            }
        }


    }

    private void viewCone() {
        Cone cone = new Cone();
        System.out.println("Wybrano Storzek");
        System.out.println("Wypisz promień");
        cone.setName("Stożek");
        double r = intput.inputDouble();
        System.out.println("Wypisz Wysokość");
        double h = intput.inputDouble();
        if (r>0){
            cone.setR(r);
            cone.setH(h);
        }
        cone.view();
    }

    private void viewBall() {
        Ball ball = new Ball();
        System.out.println("Wybrano Kule");
        System.out.println("Wypisz promień");
        ball.setName("Kula");
        double r = intput.inputDouble();
        if (r>0){
            ball.setR(r);
        }
        ball.view();
    }

    private void viewCube() {
        Cube cube = new Cube();
        System.out.println("Wybrano Sześcian");
        System.out.println("Wypisz bok a");
        cube.setName("Sześcian");
        double a = intput.inputDouble();
        if (a>0){
            cube.setA(a);
        }
        cube.view();
    }

    private void viewCuboid() {
        Cuboid cuboid = new Cuboid();
        System.out.println("Wybrano Prostopadłościan");
        System.out.println("Wypisz bok a");
        cuboid.setName("Prostopadłościan");
        double a = intput.inputDouble();
        System.out.println("Wypisz bok b");
        double b = intput.inputDouble();
        System.out.println("Wypisz bok c");
        double c = intput.inputDouble();
        if (a>0){
            cuboid.setA(a);
            cuboid.setB(b);
            cuboid.setC(c);
        }
        cuboid.view();
    }

    private void viewSquare() {
        Square square = new Square();
        System.out.println("Wybrano Kwadrat");
        System.out.println("Wypisz bok a");
        square.setName("Kwadrat");
        double a = intput.inputDouble();
        if (a>0){
            square.setA(a);
        }
        square.view();
    }

    private void viewRecangle() {
        Rectangle rectangle = new Rectangle();
        System.out.println("Wybrano Prostokąt");
        System.out.println("Wypisz bok a");
        rectangle.setName("Prostokąt");
        double a = intput.inputDouble();
        System.out.println("Wypisz bok b");
        double b = intput.inputDouble();
        if (a>0&&b>0){
            rectangle.setA(a);
            rectangle.setB(b);
        }
        rectangle.view();
    }

    private void defaultInstruction() {
        System.out.println("Błędne dane, koniec programu");
        System.exit(0);

    }

    private void Close() {
        System.out.println("Czy napewno chcesz wyjśc ?");
        String znak = intput.inputChar();
        String str1 = "t", str2 = "T";
        if (znak.equals(str1)||znak.equals(str2)) System.exit(0);
    }

    private void viewCirlcle() {
        /*
        obiekt danej klasu
        podanie nazwy firugy
        sprawdzanie wartości abs,if,random
        metoda view
        */
        Circle circle = new Circle();
        System.out.println("Wybrano Koło");
        System.out.println("Wypisz promień");
        circle.setName("Koło");
        double r = intput.inputDouble();
        if (0<r){
            circle.setR(r);
        }
        circle.view();
    }

    public void Menu(){
        System.out.println("\nKalkulator firur geometrycznych");
        System.out.println("1. Kolo\n"+
                "2. Kwadrat\n"+
                "3. Prostokąt\n"+
                "4. Sześcian\n"+
                "5. Prostopadłościan\n"+
                "6. Kula\n"+
                "7. Stożek\n"+
                "8. Wyjście\n");
        System.out.println("Wyibierz opcje\n");
    }
}
