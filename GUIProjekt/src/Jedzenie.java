public class Jedzenie {

    private String nazwa;
    private int czasGotowania;
    private int czasPlusMinus;
    private int temperatura;

    public Jedzenie(String nazwa, int czasGotowania, int czasPlusMinus, int temperatura) {
        this.nazwa = nazwa;
        this.czasGotowania = czasGotowania;
        this.czasPlusMinus = czasPlusMinus;
        this.temperatura = temperatura;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCzasGotowania() {
        return czasGotowania;
    }

    public void setCzasGotowania(int czasGotowania) {
        this.czasGotowania = czasGotowania;
    }

    public int getCzasPlusMinus() {
        return czasPlusMinus;
    }

    public void setCzasPlusMinus(int czasPlusMinus) {
        this.czasPlusMinus = czasPlusMinus;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
