public class Main {
    public static void main(String[] args) {

   /* Student student = new Student("Jan","Nowak", 21, "jn12345");

    student.info();

    Osoba osoba = new Osoba("Janina","Nowak",25);
    osoba.info();
    //Uml generator
    osoba.setFirstName("jan");
    osoba.info();*/

        Punkt []points = new Punkt[]{
                new Punkt(),
                new Punkt(2.4,5),
                new Punkt(-2.5,7)
        };

        /*for (Punkt item : points){
            item.opis();
        }
        System.out.println();
        for (Punkt item : points){
            item.zeruj();
        }
        for (Punkt item : points){
            item.opis();
        }
        System.out.println();
        for (Punkt item : points){
            item.przesun(2,3);
        }
        for (Punkt item : points){
            item.opis();
        }*/

        //UML generator
        Figura figura = new Figura();
        System.out.println(figura.opis());

        Prostokat prostokat = new Prostokat("czarny",4,3);
        System.out.println("Pole prostokata: " +prostokat.getPowierzchnia());

        prostokat.punkt.przesun(3,5);
        Kwadrat kwadrat = new Kwadrat("bialy",4);

        prostokat.opis();
        kwadrat.opis();
        System.out.println(kwadrat.getPowierzchnia());

    }
}