import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Podaj licznik: ");
            int licznik = scanner.nextInt();
            System.out.println("Podaj mianownik: ");
            int mianownik = scanner.nextInt();

            double wynik = licznik/mianownik;
            System.out.println("Wynik dzielenia: " + wynik);
        }

        catch(ArithmeticException e){
            System.err.println("Nie można dzielić przez zero");
        }catch (InputMismatchException e){
            System.err.println("Wprowadzono niepoprawne dane. " +
                    "Proszę wprowadzić liczbę.");
        }
        finally {
            scanner.close();
            System.out.println("Zakończono działanie kalkulatora");
        }*/

        /*AgeChecker ageChecker = new AgeChecker();
        try{
            ageChecker.ageCheck(18);
        }catch (NotAdultExeption e){
            System.err.println(e.getMessage());
        }*/

        //zad01
        Scanner scanner = new Scanner(System.in);
        /*
        CheckIfPositive checkIfPositive = new CheckIfPositive();
        try{
            System.out.println("Podaj liczbę do pierwiastkowania");

            int liczba = scanner.nextInt();

            checkIfPositive.checkIfPositive(liczba);

            System.out.println("Liczba spierwiastkowana: "+Math.sqrt(liczba));
        }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.err.println("Mismatch");
        }
        finally {
            System.out.println("Liczba została spierwiastkowania");
        }*/

        //zad02

        /*try{
            System.out.println("Podaj liczbę do silni");


            int liczba = scanner.nextInt();
            SilniaChecker silniachecker = new SilniaChecker();
            silniachecker.SilniaChecker(liczba);
            int wynik = 1, i ;
            for (i = 2; i <= liczba; i++) {
                wynik *= i;
            }
            System.out.println("Wynik: "+wynik);

        }catch(InputMismatchException e){
            System.err.println("Podaj liczbe");
        }catch(BlednaWartoscDlaSilniExeption e){
            System.err.println(e.getMessage());
        }*/

        //zad03
        try {
            String miejscowość;
            String ulica;
            int nrDomu;
            String kodPocztowy;
            System.out.println("Podaj miasto: \n");
            miejscowość = scanner.nextLine();
            System.out.println("Podaj ulice: \n");
            ulica = scanner.nextLine();
            System.out.println("Podaj nrDomu: \n");
            nrDomu = scanner.nextInt();
            System.out.println("Podaj kodPocztowy: \n");
            kodPocztowy = scanner.nextLine();
            Adres adres1 = new Adres(miejscowość, ulica, nrDomu, kodPocztowy);
            AdresChecker adresChecker = new AdresChecker();
            adresChecker.adresChecker(adres1);
            System.out.println(adres1);
        }
        catch (NieprawidlowyAressException e){
            System.err.println(e.getMessage());
        }
    }

}