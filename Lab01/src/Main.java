import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Siema eniu");
        //System.out.println(imie()+" lat:"+wiek());
        /*System.out.println("Podaj a");
        int a = inputIn();
        System.out.println("Podaj b");
        int b = inputIn();

        obl(a,b);*/
//        System.out.println("Wypisz liczbę");
//        if(parzystosc(inputIn())){
//            System.out.println("Parzysta");
//        }else {
//            System.out.println("Nie parzysta");
//        }
        /*System.out.println("Parzysta");
        if (podzielnosc(inputIn())){
            System.out.println("Podzielna");
        }else {
            System.out.println("Nie podzielna");
        }*/
        //System.out.println(cubic(inputIn()));*/
        //System.out.println(sqrt(inputIn()));
        System.out.println("Wypisz a");
        int aIn = inputIn();
        System.out.println("Wypisz b");
        int bIn = inputIn();
/*        System.out.println("Wypisz c");
        int cIn = inputIn();*/
        int a = losuj(aIn,bIn);
        System.out.println("a: "+a);
        int b = losuj(aIn,bIn);
        System.out.println("b: "+b);
        int c = losuj(aIn,bIn);
        System.out.println("c: "+c);
        if(isTriangle(a,b,c)){
            System.out.println("Jest trójkątem prostokątnym");
        }else{
            System.out.println("Nie jest trójkątem prostokątnym");
        }
    }

    public static String imie(){
        return "Kacper";
    }
    public static int wiek(){
        return 20;
    }

    public static void obl(int num1, int num2){
        System.out.println("Suma2: "+ (num1+num2));
        System.out.println("Różnica: "+ (num1-num2));
        System.out.println("Iloczyn: "+(num1*num2));

    }
    public static int inputIn(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static boolean parzystosc(int a){
        if(a%2==0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean podzielnosc(int a){
        if(a%3==0&&a%5==0){
            return true;
        }else {
            return false;
        }
    }
    public static double cubic(double a){
        return Math.pow(a,3);
    }

    public static double sqrt(double a){
        return Math.sqrt(a);
    }

    public static boolean isTriangle(int a,int b, int c){
        double aPow = Math.pow(a,2);
        double bPow = Math.pow(b,2);
        double cPow = Math.pow(c,2);

        if(aPow==bPow+cPow){
            return true;
        }else if(bPow==aPow+cPow){
            return true;
        }else if(cPow==aPow+bPow){
            return true;
        }else {
            return false;
        }
    }

    public static int losuj(int a, int b){
        Random random = new Random();
        int bound = b-a+1;
        int liczba = random.nextInt(bound)+a;
        return liczba;
    }
}