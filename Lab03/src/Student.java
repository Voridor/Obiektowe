public class Student {

    private Osoba osoba;
    private String numerAlbumu;

    public Student(Osoba osoba, String numerAlbumu) {
        this.osoba = osoba;
        this.numerAlbumu = numerAlbumu;
    }

    public void view(){
        System.out.println("Student:\t"+osoba.getFirstName()+" "+
                osoba.getLastName()+" "+
                osoba.getAge()+" "+
                "\tNr albumu: "+ numerAlbumu);
    }

    public void view1(){
        System.out.println("Student:\t");
        osoba.view();
        System.out.println("Nr albumu: "+ numerAlbumu);
    }
}
