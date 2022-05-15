package geekbrains.com.lesson3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
        stringList.add("Fourth");
        stringList.add("Fifth");

        System.out.println(stringList);

        stringList.remove("Third");

        stringList.remove(1);

        System.out.println(stringList);

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(5);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);


        System.out.println(integerList);

     integerList.remove(1);

        System.out.println(integerList);
    }
}
