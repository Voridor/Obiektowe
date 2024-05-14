import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        //zad01
        Scanner input = new Scanner(System.in);
        FileWriter output = null;
        String line;
        System.out.println("Podaj ścieżkę do pliku");
        try{
            output = new FileWriter(input.nextLine());
            System.out.println("Podaj zawartość pliku");
            while(true) {
                line = input.nextLine();
                if (line.equals("-")) break;
                output.write(line);
                output.write(System.lineSeparator());
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            if (output != null) output.close();
        }*/
        //zad02
        //ReadBufferFile();
        //zad03
        //SaveBinary();
        //zad04
        ReadBinray();
        }
    public static void ReadBinray() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku do odczytania");
        String filePath = scanner.nextLine();
        DataInputStream inputStream = null;
        int number1 = 0,number2 = 0,number3 = 0;
        try {
            inputStream = new DataInputStream(new FileInputStream(filePath));
            number1 = inputStream.readInt();
            number2 = inputStream.readInt();
            number3 = inputStream.readInt();
        } finally {
            System.out.println("Informacje odczytane z pliku");
            System.out.println(number1+"."+number2+"."+number3);
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
    public static void SaveBinary()throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku wyjściowego");
        String filePath = scanner.nextLine();
        System.out.println("Podaj dzień urodzenia");
        int dzien = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj miesiąc urodzenia");
        int miesiac = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj rok urodzenia");
        int rok = Integer.parseInt(scanner.nextLine());
        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new  FileOutputStream(filePath));
            outputStream.writeInt(dzien);
            outputStream.writeInt(miesiac);
            outputStream.writeInt(rok);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
    public static void ReadBufferFile() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ścieżke do pliku");
        String filePath = input.nextLine();
        int number = 0;
        BufferedReader fileReader = null;
        int i = 0;
        try {
            String line;
            fileReader = new BufferedReader(new FileReader(filePath));
            while((line = fileReader.readLine())!=null) {
                System.out.println(line);
                i++;
            }

        } finally {
            System.out.println("Plik posiada "+i+" lini");
            if (fileReader != null) {
                fileReader.close();
            }
        }

    }
}