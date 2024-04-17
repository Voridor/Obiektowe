public class AgeChecker {
    public void ageCheck(int age) throws NotAdultExeption{
        if (age < 18) {
            throw new NotAdultExeption("Osoba jest niepełnoletnia");
        }else{
            System.out.println("Osoba pełnoletnia");
        }

    }
}
