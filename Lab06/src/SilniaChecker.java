public class SilniaChecker {
    public void SilniaChecker(int num) throws BlednaWartoscDlaSilniExeption{
        if (num < 0 ){
            throw new BlednaWartoscDlaSilniExeption("Błędna liczba");
        }else {
            System.out.println("Dobra wartość silni");
        }
    }
}
