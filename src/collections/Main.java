package collections;

import java.util.*;
import static collections.ChangeValues.changeMap;
import static collections.ArrayListTime.startArrayListTime;
import static java.util.ArrayList.*;
import static collections.ArrayListDelCopy.delArrayListCopy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Обемн значений ключ <==> значение");
        HashMap<Integer, String> keys = new HashMap<Integer, String>();
        keys.put(36251, "Artem");
        keys.put(12584, "Sergey");
        keys.put(18547, "Ruslan");
        keys.put(37589, "Victor");

        System.out.println(keys);
        //Change key<==>value
        System.out.println(changeMap(keys));

        //Задание №2
        System.out.println();
        System.out.println("Замер скорости обработки данных");
        startArrayListTime();


        //Задание №2
        System.out.println();
        System.out.println("Удаление дубликатов из ArrayList");
        ArrayList<String> arrayValues = new ArrayList<String>();
        delArrayListCopy(arrayValues);
    }
}