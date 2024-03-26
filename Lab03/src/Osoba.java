public class Osoba {

    private String firstName, lastName;

    private int age;

    protected int liczba;

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", liczba=" + liczba +
                '}';
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Osoba() {
    }

    public Osoba(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Osoba(String _firstName, String lastName, int age) {
        this.firstName = _firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void view(){
        System.out.println("Imie:"+ firstName + "\tNazwisko: " +lastName+ "\tWiek: "+age);
    }
}
