import java.util.Random;
import java.util.Scanner;

public class Main {


    static int studenciIlosc;
    static int i =0;
    static int[] punkty;

    static int sumPunkty;

    static float[] tabF = new float[10];
    public static void main(String[] args) {

      //lab03

        /*System.out.println("Wypisz liczbe studentów");
        studenciIlosc = inputIn();
        punkty = new int[studenciIlosc];
        //System.out.println(studenciIlosc);
        while (studenciIlosc>i){
            System.out.println("Punkty studenta nr: "+ (i+1));
            int pkt = inputIn();
            punkty[i] = pkt;
            sumPunkty += pkt;
            i++;
        }

        System.out.println("Średnia ilość punktów to:"+ (sumPunkty/studenciIlosc));*/



        //lab04
        //1
        for(int i = 0;i<tabF.length;i++){
            tabF[i] = losuj(1,10);
            System.out.println(i);
        }
        System.out.println("Suma to: "+ suma(tabF));
        System.out.println("Średnia to: "+ srednia(tabF));

    }
    public static int inputIn(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static float suma(float[] tab){
        float suma = 0;
        for (float i : tab){
            System.out.println("I"+i);
            suma += i;
        }
        System.out.println("Suma to:" + suma);
//        for(int i=0; i<tab.length;i++){
//            sredniaLiczba += tab[i];
//        }
        return suma;
    }

    public static float srednia(float[] tab){
        float suma = suma(tab);
        float sredniaLiczba = suma/tab.length;
        return sredniaLiczba;
    }
    public static int losuj(int a, int b){
        Random random = new Random();
        int bound = b-a+1;
        int liczba = random.nextInt(bound)+a;
        return liczba;
    }
}