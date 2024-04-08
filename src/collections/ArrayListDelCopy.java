//*****************************************************************************************
//*       Метод, который на вход примет ArrayList строк и удаляет из него все дубликаты,  *
//*       не используя метод contains(). Можно использовать другие коллекции,             *
//*       которые были изучены на уроке.                                                  *
//*****************************************************************************************

// Используем "грубую" силу и свойства коллекции HashSet которая удаляет дубликаты.
//Преобразуем ArrayList в массив, потом заполним HashSet, который удалит дубликаты.

package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class ArrayListDelCopy {

    public static ArrayList<String> delArrayListCopy(ArrayList<String> values){
        ArrayList<String> arrayValues = new ArrayList<String>(); //первоначальная коллекция с дубликатами
        HashSet<String> sortedValues = new HashSet<>(); //HashSet чтобы удалить дубликаты

        arrayValues.add("Artem");
        arrayValues.add("Ivan");
        arrayValues.add("Ruslan");
        arrayValues.add("Sergey");
        arrayValues.add("Artem");
        arrayValues.add("Ruslan");
        System.out.println(arrayValues);

        String[] changeArray = new String[arrayValues.size()];

        arrayValues.toArray(changeArray);

        System.out.println();
        for (int i=0; i < changeArray.length; i++){
            sortedValues.add(changeArray[i]);
        }

        System.out.println(sortedValues);


        return null;

    }
}
