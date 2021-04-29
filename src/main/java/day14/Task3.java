package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList() {

        File file = new File("People");
        List<Person> peope = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                Person current = new Person(person[0], Integer.parseInt(person[1]) );
                peope.add(current);
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


