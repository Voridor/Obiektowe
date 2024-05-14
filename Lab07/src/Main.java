import java.util.*;

public class Main {
    public static void main(String[] args) {

    /*List<String> names = new ArrayList<>();
    List<String> names1 = new LinkedList<>();
    */
    /*names.isEmpty();
    names.add("Jan");
    names.add("Jan1");
    names.add("Jan2");
    names.add("Jan3");
    names.add("Jan4");
    System.out.println("Lista imion: "+names);
    names.remove(3);
    System.out.println("Lista imion: "+names);
    System.out.println("Lista imion: "+names.get(1));

    for(int i = 0; i<names.size(); i++){
        System.out.println(names.get(i));
    }

    for (String item : names) {
        System.out.println(item);
    }

    names1.add("Jan");*/
/*
    Set<String> uniqueNames = new HashSet<>();
    Set<String> uniqueNames1 = new LinkedHashSet<>();
    Set<String> uniqueNames2 = new TreeSet<>();

    uniqueNames.add("Anna");
    uniqueNames.add("Jan");
    uniqueNames.add("Maria");
    uniqueNames.add("Anna");

    System.out.println(uniqueNames);
    uniqueNames.remove("Jan");
    System.out.println(uniqueNames);*/

    /*HashMap<String,Integer> age = new HashMap<>();

    age.put("Anna",15);
    age.put("Jan",18);
    age.put("Maria",23);

    System.out.println("wiek osób: "+age);
    System.out.println("wiek Anny: "+age.get("Anna"));

    for (String name : age.keySet()) {
        System.out.println(age);
    }
    for (Integer name : age.values()) {
        System.out.println(age);
    }

    for(Map.Entry<String,Integer> entry : age.entrySet()) {
        System.out.println("Imie: "+entry.getKey()+" wiek: "+entry.getValue());
    }*/
        //zad1();
        //zad2();
        Uczestnicy uczestnicy;

        uczestnicy = new Uczestnicy(1,"Jan",18);
        uczestnicy = new Uczestnicy(2,"Mariusz",20);


    }
    public static void zad1(){
        Scanner sc = new Scanner(System.in);
        Set<String> names = new HashSet<>();

        System.out.println("Podaj imie (jeżeli chcec zakończyć wpisz '-': )");

        while(true){
            String input = sc.nextLine();
            if(input.equals("-"))
                break;

            names.add(input);
        }
        System.out.println("Liczba unikalnych imion "+names.size());

    }
    public static void zad2(){
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> pary = new HashMap<>();

        System.out.println("Podaj imiona par (jeżeli chcec zakończyć wpisz '-': )");

        while(true){
            System.out.println("Podaj imie pierwszej osoby");
            String input = sc.nextLine();
            System.out.println("Podaj imie drugiej osoby");
            String input1 = sc.nextLine();
            if(input.equals("-") || input1.equals("-"))
                break;

            pary.put(input,input1);
        }
        System.out.println("Podaj jedno z wprowadzonych imion");
        System.out.println("Imie pary "+pary.get(sc.nextLine()));


    }

}