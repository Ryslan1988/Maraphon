package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {

        File file = new File("People");
        List<String> peope = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                peope.add(line);
            }
            return peope;
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");
        } catch (IllegalArgumentException e) {
            System.out.println("Not correctly");
        }
        return null;
    }


}

