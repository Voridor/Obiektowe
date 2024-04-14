public class Samochod implements Jedzie{


    @Override
    public void jedz(String metoda, double odleglosc) {
        System.out.println("Jedziesz za pomocą "+metoda+" na odleglosc "+odleglosc);
    }
}
