public class CheckIfPositive {
    public void checkIfPositive(int num) throws IllegalArgumentException {
        if (num < 0){
            throw new IllegalArgumentException("Nie została podana liczba dodatnia");
        } else {
            System.out.println("Została podana liczba");
        }
    }
}
