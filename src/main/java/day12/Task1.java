//

package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List muList = new ArrayList<>();

        muList.add("Toyota");
        muList.add("Nissan");
        muList.add("BMW");
        muList.add("Subary");
        muList.add("Honda");

        System.out.println(muList);

        muList.add(2, "Shkoda");

        System.out.println(muList);

        muList.remove(0);

        System.out.println(muList);


    }
}
