package Runing;

import Figures.Circle;
import Figures.Rectangle;

public class Run {

    Input intput = new Input();

    public void runing(){
        int wybor;
        while (true){
            Menu();
            wybor = intput.inputInt();
            switch (wybor){
                case 1 -> viewCirlcle();
                case 2 -> viewRecangle();
                case 8 -> Close();
                default -> defaultInstruction();
            }
        }


    }

    private void viewRecangle() {
        Rectangle rectangle = new Rectangle();
        System.out.println("WYbrano Kwadrat");
        System.out.println("Wypisz bok a");
        rectangle.setName("Kwadrat");
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
