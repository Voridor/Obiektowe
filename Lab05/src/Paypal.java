public class Paypal implements MetodaPlatnosci {
    private String haslo;
    private String email;

    public void zaplac(double kwota){
        System.out.println("Zapłać Paypal "+kwota);
    }
}
