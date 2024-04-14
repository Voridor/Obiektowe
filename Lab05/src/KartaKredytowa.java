public class KartaKredytowa implements MetodaPlatnosci{
    private String numerKarty;
    private String cvv;
    private String dataWarznosci;

    public void zaplac(double kwota){
        System.out.println("Płatność kartą kredytową na kwotę: "+ kwota);
    }


}
