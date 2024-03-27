public class Student extends Osoba {
    private String nrAlbumu;

    public Student(String firstName, String lastName, int age, String nrAlbumu) {
        super(firstName, lastName, age);
        this.nrAlbumu = nrAlbumu;
    }

    public void info(){
        super.info();
        System.out.println("Nr albumu: "+nrAlbumu);
    }
}
