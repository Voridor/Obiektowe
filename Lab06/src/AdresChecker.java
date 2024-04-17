public class AdresChecker {
    public void adresChecker(Adres adres) throws NieprawidlowyAressException{
        String exitMessage = "";
        if(adres.kodPocztowy == null){
            exitMessage += "Nieprawidowy kod pocztowy. ";
        }else if(adres.miejscowość == null){
            exitMessage += "Nieprawidowa miejscowość. ";
        }else if(adres.ulica == null){
            exitMessage += "Nieprawidowa ulica. ";
        }else if(adres.nrDomu <= 0){
            exitMessage += "Nieprawidowy nrDomu. ";
        }
    }
}
